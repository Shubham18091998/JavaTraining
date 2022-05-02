package com.cts.exstatement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cts.util.JdbcConnection;

public class EmployeeDaoImplementation implements EmployeeDao {

	@Override
	public void insert(Employee emp) {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		Statement st=null;
		try {
			st=con.createStatement();
			int empno=emp.getEmpno();
			String name=emp.getName();
			int salary=emp.getSalary();
			String email=emp.getEmail();
			String city=emp.getCity();
			int deptno=emp.getDeptno();
			String query="insert into employee values("+empno+",'"+name+"',"+salary+",'"+email+"','"+city+"',"+deptno+")";
			//System.out.println(query);
			int rec=st.executeUpdate(query);
			if(rec==1) {
				System.out.println("Record sucessfully inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean delete(int empno) {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		Statement st=null;
		try {
			st=con.createStatement();
			String query="delete from employee where empno="+empno;
			//System.out.println(query);
			int rec=st.executeUpdate(query);
			if(rec==1) {
				System.out.println("Record deleted sucessfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateSalary(int empno, int salary) {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		Statement st=null;
		try {
			st=con.createStatement();
			String query="update employee set salary="+salary+" where empno="+empno;
			//System.out.println(query);
			int rec=st.executeUpdate(query);
			if(rec==1) {
				System.out.println("Record updated sucessfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public ArrayList<Employee> getAllRecords() {
		// TODO Auto-generated method stub
		ArrayList<Employee>empList=new ArrayList<>();
		Connection con=JdbcConnection.getConnection();
		Statement st=null;
		ResultSet rs=null;
		try {
			st=con.createStatement();
			String query="select * from employee";
			//System.out.println(query);
			rs=st.executeQuery(query);
			while(rs.next()) {
				int empno=rs.getInt(1);
				String name=rs.getString(2);
				int salary=rs.getInt(3);
				String email=rs.getString(4);
				String city=rs.getString(5);
				int deptno=rs.getInt(6);
				Employee emp=new Employee(empno,name,salary,email,city,deptno);
				empList.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	@Override
	public Employee getEmployee(int empno) {
		// TODO Auto-generated method stub
		Connection con=JdbcConnection.getConnection();
		Statement st=null;
		ResultSet rs=null;
		Employee emp=null;
		try {
			st=con.createStatement();
			String query="select * from employee where empno="+empno;
			//System.out.println(query);
			rs=st.executeQuery(query);
			if(rs.next()) {
				String name=rs.getString(2);
				int salary=rs.getInt(3);
				String email=rs.getString(4);
				String city=rs.getString(5);
				int deptno=rs.getInt(6);
				emp=new Employee(empno,name,salary,email,city,deptno);
				return emp;
				
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
