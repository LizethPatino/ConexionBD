package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;
//Para el sql server
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
*
* @author Liz
*/
public class ConexionDB {
	
	
 public Connection conectar() {
	 
	 Connection conexion = null;
	 
     try{
    	 
    	 //driver	
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         //url   
         String Url = "jdbc:sqlserver://LIZETH:1433;databaseName=UD;user=sasha1;password=1234;";
         
    	    //obtención de la conexión
    	       conexion = DriverManager.getConnection(Url);
    	       
    	       //Revisión de la conexión con la base de datos
    	       JOptionPane.showMessageDialog(null,"conectado");
    	      }catch(Exception ex){
    	          JOptionPane.showMessageDialog(null,ex,"Error al Conectar"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
    	      }
     return conexion;
 	}
 
}
	
 
      
      
      
  
  