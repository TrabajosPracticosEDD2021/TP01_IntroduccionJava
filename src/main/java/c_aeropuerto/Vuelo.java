package c_aeropuerto;

import java.time.LocalDateTime;

public class Vuelo {
	
	private int numVuelo;
	private LineaAerea lineaAerea;
	private Ciudad ciudadOrigen, ciudadDestino;
	private LocalDateTime fechaHoraPartida, fechaHoraArribo;
	
	public Vuelo(int numVuelo, LineaAerea lineaAerea, Ciudad ciudadOrigen, Ciudad ciudadDestino,
			LocalDateTime fechaHoraPartida, LocalDateTime fechaHoraArribo) {
		this.numVuelo = numVuelo;
		this.lineaAerea = lineaAerea;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.fechaHoraPartida = fechaHoraPartida;
		this.fechaHoraArribo = fechaHoraArribo;
	}

	public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public LineaAerea getLineaAerea() {
		return lineaAerea;
	}

	public void setLineaAerea(LineaAerea lineaAerea) {
		this.lineaAerea = lineaAerea;
	}

	public Ciudad getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(Ciudad ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public Ciudad getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(Ciudad ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public LocalDateTime getFechaHoraPartida() {
		return fechaHoraPartida;
	}

	public void setFechaHoraPartida(LocalDateTime fechaHoraPartida) {
		this.fechaHoraPartida = fechaHoraPartida;
	}

	public LocalDateTime getFechaHoraArribo() {
		return fechaHoraArribo;
	}

	public void setFechaHoraArribo(LocalDateTime fechaHoraArribo) {
		this.fechaHoraArribo = fechaHoraArribo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vuelo other = (Vuelo) obj;
		return numVuelo == other.numVuelo;
	}

	@Override
	public String toString() {
		return "Vuelo [numVuelo=" + numVuelo + ", lineaAerea=" + lineaAerea + ", ciudadOrigen=" + ciudadOrigen
				+ ", ciudadDestino=" + ciudadDestino + ", fechaHoraPartida=" + fechaHoraPartida + ", fechaHoraArribo="
				+ fechaHoraArribo + "]";
	}
}
