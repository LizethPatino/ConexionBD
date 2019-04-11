package Modelo;

public class Estudiante {
	private int codigoEst;
	private String nombreEst;
	private String apellidoEst;
	private String telefonoEst;
	
	
	public Estudiante() {
		super();
		
	}


	public Estudiante(int codigoEst, String nombreEst, String apellidoEst, String telefonoEst) {
		super();
		this.codigoEst = codigoEst;
		this.nombreEst = nombreEst;
		this.apellidoEst = apellidoEst;
		this.telefonoEst = telefonoEst;
	}


	public int getCodigoEst() {
		return codigoEst;
	}


	public void setCodigoEst(int codigoEst) {
		this.codigoEst = codigoEst;
	}


	public String getNombreEst() {
		return nombreEst;
	}


	public void setNombreEst(String nombreEst) {
		this.nombreEst = nombreEst;
	}


	public String getApellidoEst() {
		return apellidoEst;
	}


	public void setApellidoEst(String apellidoEst) {
		this.apellidoEst = apellidoEst;
	}


	public String getTelefonoEst() {
		return telefonoEst;
	}


	public void setTelefonoEst(String telefonoEst) {
		this.telefonoEst = telefonoEst;
	}
	@Override
	public String toString() {
		return this.getNombreEst()+" "+this.getApellidoEst();
	}
	
	
}
