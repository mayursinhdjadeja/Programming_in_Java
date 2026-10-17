/*
 * Write a JDBC program to Display Records Into Oracle Table Using Prepared Statement.
*/

import java.sql.*;
class DisplayPrepared 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM STUDENT");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) 
        {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
        con.close();
    }
}