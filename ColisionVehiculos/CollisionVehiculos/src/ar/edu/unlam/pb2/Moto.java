package ar.edu.unlam.pb2;

public class Moto extends Vehiculo{
	private Integer CAPACIDAD_MAXIMA_DE_PASAJEROS=2;
	private String patente;
	private Integer velocidadMaxima;
	

	public Moto(String patente, Integer velocidadMaxima, Double latitud,
			Double longitud) {
		super(latitud, longitud);
		this.setPatente(patente);
		this.setVelocidadMaxima(velocidadMaxima);
		// TODO Auto-generated constructor stub
	}


	public Integer getCAPACIDAD_MAXIMA_DE_PASAJEROS() {
		return CAPACIDAD_MAXIMA_DE_PASAJEROS;
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
