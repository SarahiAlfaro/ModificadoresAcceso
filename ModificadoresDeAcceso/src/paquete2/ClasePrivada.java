package paquete2;

public class ClasePrivada {
 //atributos
	private String nombre;
	private int edad;
	
	//m�todos
	public void setSaludar(String nombre) {//fijar un valor
		this.nombre = nombre;		
	}
	public String getSaludar() {
		return this.nombre;
	}
}
