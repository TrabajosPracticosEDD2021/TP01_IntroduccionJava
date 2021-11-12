package c_aeropuerto;

import java.util.Objects;

public class Ciudad {
	private String codIATA, nombre;

	public Ciudad(String codIATA, String nombre) {
		super();
		this.codIATA = codIATA;
		this.nombre = nombre;
	}

	public String getCodIATA() {
		return codIATA;
	}

	public void setCodIATA(String codIATA) {
		this.codIATA = codIATA;
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
		Ciudad other = (Ciudad) obj;
		return Objects.equals(codIATA, other.codIATA);
	}

	@Override
	public String toString() {
		return "Ciudad [codIATA=" + codIATA + ", nombre=" + nombre + "]";
	}
}
