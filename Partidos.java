import java.time.LocalDateTime;

public class Partidos {
	
	private LocalDateTime fecha;

	
	public Partidos(LocalDateTime fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Partidos [fecha=" + fecha + "]";
	}

}
