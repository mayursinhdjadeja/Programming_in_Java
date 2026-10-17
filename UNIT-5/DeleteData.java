/*
 * Write a JDBC program to Delete data from Oracle Table.
*/

import java.sql.*;
class DeleteData 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        Statement st = con.createStatement();
        st.executeUpdate("DELETE FROM student WHERE enrollmentNo=7071");
        System.out.println("Data Deleted Successfully!");
        con.close();
    }
}