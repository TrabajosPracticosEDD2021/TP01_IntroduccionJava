package b_veterinaria;


public class Persona {

	private String apellido, nombre, dni;

	public Persona(String apellido, String nombre, String dni) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	protected void sumarMascota() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return this.dni == other.dni;
	}

	@Override
	public String toString() {
		return "[apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + "]";
	}

	
}
