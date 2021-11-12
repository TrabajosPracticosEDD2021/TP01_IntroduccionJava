package b_veterinaria;

import java.util.Objects;

public class Raza {

	private String nombre;
	private Especie especie;
	
	public Raza(String nombre, Especie especie) {
		this.nombre = nombre;
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Raza other = (Raza) obj;
		return Objects.equals(especie, other.especie) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", especie=" + especie + "]";
	}
	
	
}
