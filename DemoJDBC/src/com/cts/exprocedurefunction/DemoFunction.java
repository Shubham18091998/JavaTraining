package com.cts.exprocedurefunction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.cts.util.JdbcConnection;
import java.sql.Types;

public class DemoFunction {
	static void showSalary(int empno) {
		Connection con=null;
		CallableStatement cst=null;
		con=JdbcConnection.getConnection();
		String query="{?=call getempsal(?)}";
		try {
			cst=con.prepareCall(query);
			cst.setInt(2, empno);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.execute();;
			System.out.println("Salary of "+empno+" is "+cst.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				cst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		CallableStatement cst=null;
		con=JdbcConnection.getConnection();
		String query="{?=call totalEmpcount()}";
		try {
			cst=con.prepareCall(query);
			cst.registerOutParameter(1, Types.INTEGER);
			cst.execute();
			System.out.println("Total number of employees="+cst.getInt(1));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				cst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		showSalary(102);
	}

}


/*
delimiter //
create function totalEmpcount() returns int
     DETERMINISTIC
     begin
     declare
       total_count int;
        select count(*) into total_count from employee;
        return total_count;
     end//
delimiter ;
*/

/*
delimiter //
 
  create function getempsal(v_empno int) returns int
     DETERMINISTIC
     begin        
     declare 
            v_sal int;
            select salary into v_sal from employee where empno=v_empno;
            return v_sal;
     end//
 
delimiter ;
*/
