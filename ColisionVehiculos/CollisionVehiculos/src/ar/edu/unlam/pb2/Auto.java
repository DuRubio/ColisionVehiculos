package ar.edu.unlam.pb2;

public class Auto extends Vehiculo{
	private Integer cantidadMaximaDePasajeros;
	private String patente;
	private Integer velocidadMaxima;
	
	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.setPatente(patente);
		this.setVelocidadMaxima(velocidadMaxima);
		this.cantidadMaximaDePasajeros=cantidadMaximaDePasajeros;
		
	}
	protected Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;
	}
	protected void setCantidadMaximaDePasajeros(Integer cantidadMaximaDePasajeros) {
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	

}
