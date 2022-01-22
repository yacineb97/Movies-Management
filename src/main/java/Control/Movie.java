package Control;

import Model.Cnxion;
import Model.MovieEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Yacine Boulaioune
 */
public class Movie {

    public String Title;
    public int Year;
    public String Genre;
    
    // Constructors
    public Movie(String Titre , int Year, String Genre){
        this.Title= Titre;
        this.Year= Year;
        this.Genre=Genre;
    
    }
   public Movie() {
      this.Title="Unknown";
      this.Genre="Unknown";
      this.Year=0;
    }

   //Getters and Setters
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }
   
   public void showMoviesList(){
        Cnxion conn = new Cnxion();   // to connect to DataBase
        conn.toConnect();
        
        Statement st;
        ResultSet rs = null;
        Connection cnx;
        cnx = conn.getCon();

        st = conn.getStmt();
        
        
         try {
             String sql="select * from movie where Genre='dramatique'";  // le code sql 
             st=cnx.createStatement();
             
             rs= st.executeQuery(sql);
             System.out.println("Listes de films dramatiques :\n");
             while(rs.next()){
                 // Affichage des informations du film selectioné 
                 System.out.println(rs.getString("Title")+"\t" + rs.getInt("Year")+"\t"+rs.getString("Genre") +"\n");
             }
         } catch (SQLException ex) {
             Logger.getLogger(MovieEntity.class.getName()).log(Level.SEVERE, null, ex);
       
   }
       
         }

   
  
    }
