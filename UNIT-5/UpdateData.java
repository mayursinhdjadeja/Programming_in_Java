/*
 * Write a JDBC program to Update data into Oracle Table.
*/

import java.sql.*;
class UpdateData 
{
    public static void main(String args[]) throws Exception 
    {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "javaSelfStudy", "12345");
        Statement st = con.createStatement();
        st.executeUpdate("UPDATE student SET name='Harsh' WHERE enrollmentNo=7071");
        System.out.println("Data Updated Successfully!");
        con.close();
    }
}