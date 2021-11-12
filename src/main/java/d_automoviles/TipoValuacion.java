package d_automoviles;

import java.math.BigDecimal;

public class TipoValuacion {

	private	Tipo tipo;
	private BigDecimal valuacion;
	
	public TipoValuacion(Tipo tipo, BigDecimal valuacion) {
		this.tipo = tipo;
		this.valuacion = valuacion;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getValuacion() {
		return valuacion;
	}
	public void setValuacion(BigDecimal valuacion) {
		this.valuacion = valuacion;
	}
	@Override
	public String toString() {
		return "TipoValuacion [tipo=" + tipo + ", valuacion=" + valuacion + "]";
	}
	
	
}
