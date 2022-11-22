package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	private String nombre;
	private  Set<Vehiculo> vehiculos;
	
	
	public Mapa (String nombre) {
		this.nombre=nombre;
		vehiculos=new HashSet<Vehiculo>();
	}
	
	
	public void setNombre (String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre () {
		return nombre;
	}


	public void agregarVehiculo(Vehiculo v) {
		vehiculos.add(v);
		
	}


	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}


	public Boolean hayCoalición() throws ColitionException {
		Boolean chocaron = false;
		
		for (Vehiculo vehiculoX : vehiculos) {
			for (Vehiculo vehiculoY : vehiculos) {
				if(vehiculoX!=vehiculoY && vehiculoX.getLatitud().equals(vehiculoY.getLatitud()) && vehiculoX.getLongitud().equals(vehiculoY.getLongitud())) {
					chocaron=  true;
				
					throw new ColitionException ("Chocaron wey");
				}
			}
		}
		
		return chocaron;
	}
}
