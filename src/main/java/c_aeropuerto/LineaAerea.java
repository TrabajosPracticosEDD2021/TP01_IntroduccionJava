package c_aeropuerto;

public class LineaAerea {
	
	private int numero;
	private String nombre;
	
	public LineaAerea(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
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
		LineaAerea other = (LineaAerea) obj;
		return numero == other.numero;
	}

	@Override
	public String toString() {
		return "LineaAerea [numero=" + numero + ", nombre=" + nombre + "]";
	}
}
