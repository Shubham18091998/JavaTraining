package com.cts.exprocedurefunction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.cts.util.JdbcConnection;

public class DemoProcedure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		CallableStatement cst=null;
		con=JdbcConnection.getConnection();
		String query="{call insertdept(?,?,?)}";
		try {
			cst=con.prepareCall(query);
			cst.setInt(1, 9007);
			cst.setString(2, "IT");
			cst.setInt(3, 1004);
			cst.execute();
			System.out.println("Record inserted successfully");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				cst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}

/*
delimiter //
 create procedure insertdept(v_deptno INT(5), v_dname varchar(15), v_lid INT(5))
     begin
     insert into department values(v_deptno,v_dname,v_lid);
     end//
 
delimiter ; 
*/
