package b_veterinaria;

import java.util.Objects;

public class Mascota {
	
	private int anioNacimiento, numRegistro;
	private String nombre;
	private Persona duenio;
	private Raza raza;
	
	public Mascota(int anioNacimiento, int numRegistro, String nombre, Persona duenio, Raza raza) {
		this.anioNacimiento = anioNacimiento;
		this.numRegistro = numRegistro;
		this.nombre = nombre;
		this.duenio = duenio;
		this.raza = raza;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return Objects.equals(duenio, other.duenio) && numRegistro == other.numRegistro
				&& Objects.equals(raza, other.raza);
	}

	@Override
	public String toString() {
		return "Mascota [anioNacimiento=" + anioNacimiento + ", numRegistro=" + numRegistro + ", nombre=" + nombre
				+ ", duenio=" + duenio + ", raza=" + raza + "]";
	}

	
	
}
