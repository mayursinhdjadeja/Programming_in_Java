/*
 * Write a JDBC program to Update and Delete Records Into Oracle Table Using Prepared Statement. 
*/

import java.sql.*;
class UpdateDeletePrepared 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        PreparedStatement ps = con.prepareStatement("UPDATE STUDENT SET NAME=? WHERE ID=?");
        ps.setString(1, "Rahul");
        ps.setInt(2, 7073);
        ps.executeUpdate();

        ps = con.prepareStatement("DELETE FROM STUDENT WHERE ID=?");
        ps.setInt(1, 7073);
        ps.executeUpdate();

        System.out.println("Update and Delete Successful!");
        con.close();
    }
}