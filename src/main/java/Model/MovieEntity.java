
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.Movie;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Yacine Boulaioune
 */
public class MovieEntity {
    
     Cnxion conn = new Cnxion();

    public void addMovie(Movie e) {

        conn.toConnect();
        Statement stmt;
        ResultSet rs;

        stmt = conn.getStmt();
// STEP 2: perform operations on the database:

        
        try {
            // Selection et parcours
            stmt.execute("INSERT INTO  Film(  Title ,  Genre ,  Year ) VALUES ('" + e.getTitle()+ "','" + e.getGenre()+ "','" + e.getYear()+ "')");

            JOptionPane.showMessageDialog(null, "Movie added with Success !", "Success Message.",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
           

            JOptionPane.showMessageDialog(null, "Connexion issue !", "Error Message",
                    JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }

       
// STEP 3: close the connexion to the database:
        conn.close();

    }
}
    
    
