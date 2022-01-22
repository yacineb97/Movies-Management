/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Cnxion {
 
    private Connection con;
    private Statement stmt;
 
    /** Creates a new instance of Connection */
    public Cnxion() {
       
        String username = "root";
        String password = "";
        
        
        String url = "jdbc:mysql://localhost/MovieManagement?useSSL=false";
 
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ");
            System.err.println(e.getMessage());
        }
        try{
            con = DriverManager.getConnection(url, username, password);
            System.out.println("OK connexion réussie...");
            stmt = con.createStatement();
 
        }
 
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
 
    public Statement getStmt() {
        return stmt;
    }
 
    public Connection getCon() {
        return con;
    }
     
 public void toConnect() {
        try{
            Cnxion connect = new Cnxion();
            stmt = connect.getStmt();
            con = connect.getCon();
//             rqt = new Requete(con, stmt);
            //mise_a_jour();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
 public void close(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
 }

}
