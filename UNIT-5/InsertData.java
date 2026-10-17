/*
 * Write a JDBC program to Insert data into Oracle Table.
*/

import java.sql.*;
class InsertData 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        Statement st = con.createStatement();
        st.executeUpdate("INSERT INTO student VALUES (7074, 'Mayursinh')");
        System.out.println("Data Inserted Successfully!");
        con.close();
    }
}
