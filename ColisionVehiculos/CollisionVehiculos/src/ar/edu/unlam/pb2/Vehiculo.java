package ar.edu.unlam.pb2;

import java.util.Objects;

public class Vehiculo {
	
	private Double latitud;
	private Double longitud;
	
	public Vehiculo(Double latitud,	Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}


	protected Double getLatitud() {
		return latitud;
	}

	protected void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	protected Double getLongitud() {
		return longitud;
	}

	protected void setLongitud(Double longitud) {
		this.longitud = longitud;
	}


	public void actualizarCoordenadas(double latitud, double longitud) {
		setLatitud(latitud);
		setLongitud(longitud);

		
	}


//	@Override
//	public int hashCode() {
//		return Objects.hash(latitud, longitud);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Vehiculo other = (Vehiculo) obj;
//		return Objects.equals(latitud, other.latitud) && Objects.equals(longitud, other.longitud);
//	}
	
	
	
	
}
