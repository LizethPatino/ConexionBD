package Conecta;
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
public class SQLDatabaseConnection {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      Connection conexion = null;
      try{
      
    //driver	
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      
    //url   
       String Url = "jdbc:sqlserver://LIZETH:1433;databaseName=UD;user=sasha1;password=1234;";
       ResultSet resultSet = null;
       
    //obtenci�n de la conexi�n
       
       conexion = DriverManager.getConnection(Url);
       
    //creaci�n de la declaraci�n o petici�n a la DB   
       Statement statement = conexion.createStatement();
       
      // Create and execute a SELECT SQL statement.
       String selectSql = "SELECT * FROM Facultad";
       resultSet = statement.executeQuery(selectSql);

       // Print results from select statement
       while (resultSet.next()) {
           System.out.println(resultSet.getString(1)+" "+resultSet.getString(2) + " " + resultSet.getString(3)+" " +resultSet.getString(4));
       }
       //Revisi�n de la conexi�n con la base de datos
       JOptionPane.showMessageDialog(null,"conectado");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,ex,"Error al Conectar"+ex.getMessage(),JOptionPane.ERROR_MESSAGE);
      }
      
      
  }
  
}