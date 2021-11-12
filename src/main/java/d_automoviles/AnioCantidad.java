package d_automoviles;

public class AnioCantidad {

	private int cantidad, modelo;

	public AnioCantidad(int cantidad, int modelo) {
		this.cantidad = cantidad;
		this.modelo = modelo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "AnioCantidad [cantidad=" + cantidad + ", modelo=" + modelo + "]";
	}

	
	
	
}
