/*
 *  Write a JDBC program to Insert Records Into Oracle Table Using Prepared Statement. 
*/

import java.sql.*;
class InsertPrepared 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT VALUES (?, ?)");
        ps.setInt(1, 7073);
        ps.setString(2, "Jill");
        ps.executeUpdate();
        System.out.println("Data Inserted Successfully!");
        con.close();
    }
}