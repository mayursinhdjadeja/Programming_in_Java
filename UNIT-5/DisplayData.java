/*
 * Write a JDBC program to Display data from Oracle Table.
*/

import java.sql.*;
class DisplayData 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        while (rs.next()) 
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        con.close();
    }
}