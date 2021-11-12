package d_automoviles;

import java.math.BigDecimal;
import java.util.Objects;

public class Automovil {

	private BigDecimal valucion;
	private int anio;
	private String matricula;
	private Marca marca;
	private Tipo tipo;
	
	public Automovil(BigDecimal valucion, int anio, String matricula, Marca marca, Tipo tipo) {
		this.valucion = valucion;
		this.anio = anio;
		this.matricula = matricula;
		this.marca = marca;
		this.tipo = tipo;
	}

	public BigDecimal getValucion() {
		return valucion;
	}

	public void setValucion(BigDecimal valucion) {
		this.valucion = valucion;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovil other = (Automovil) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Automovil [valucion=" + valucion + ", anio=" + anio + ", matricula=" + matricula + ", marca=" + marca
				+ ", tipo=" + tipo + "]";
	}

	
	
	
}
