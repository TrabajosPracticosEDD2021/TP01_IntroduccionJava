package b_veterinaria;

import java.util.Objects;

public class Especie {

	private String nombre;

	public Especie(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especie other = (Especie) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + "]";
	}
	
	
}
