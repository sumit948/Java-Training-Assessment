package com.program.assignment2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee {

	public static void main(String[] args) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/assignmentno2",    
                    "postgres","Sumitraj");
			Statement st=con.createStatement();
			
			//step 1
			//creating Table is database
//			boolean status =st.execute("create table employee(empid int, empname varchar(20), empphone text, "
//					+ "empdepartment varchar(40), empemail varchar(30), emprole varchar(50));");
			
			
			//step 2
			//adding data into the table
			/*
			st.executeUpdate("insert into employee values(001,'Jhon Weak', '9128001214','EAD', 'jhonabc@gamil.com', 'Sr. Software Engineer'),"
            		+ "(002,'Tony Jaa', '9129001214','SAP', 'toneeabc@gamil.com', 'Sr. Manager'),"
            		+ "(003,'Barak', '9130001214','DD', 'Barakbc@gamil.com', 'Sr. Software Engineer'),"
            		+ "(004,'Cristano', '9131001214','CD', 'Ronaldoabc@gamil.com', 'Sr. Practice Lead');");
			System.out.println("Query has been executes Successfully");
			*/
			
			
			//step 3
			//to update a paritcular record
			//st.execute("update employee set empname='Rock' where empid =3;");
			
			
			//Step 4
			//to delete particular record
			
            //st.execute("delete from employee where empid=1;");
			
            st.close();
            con.close();
		}
		catch(Exception e) {
			System.out.println("Error");
		}


	}

}
