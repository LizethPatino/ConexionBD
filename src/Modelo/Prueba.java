package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Prueba {
	
	public void cargarData() throws SQLException {
		//Statement stm = ConexionDB.getConnection().createStatement();
		 ConexionDB con = new ConexionDB();
		 Statement stm = con.conectar().createStatement();
		 ResultSet rst = stm.executeQuery("SELECT * FROM Estudiante");
		 while(rst.next()) {
			 System.out.println(rst.getString(1)+" "+rst.getString(2) + " " + rst.getString(3)+" " +rst.getString(4));	 
		 }	    
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
	
		   // ConexionDB con = new ConexionDB();
		   // con.conectar();
			//System.out.println("Conexión Éxitosa");
		Prueba pru = new Prueba();
		pru.cargarData();
			
		      
	}

}
