import java.util.Scanner;

public class Jugador {

	Scanner lector = new Scanner(System.in);
	private String nombre;
	private String posicion;
	private String equipo;

	public Jugador() {
		super();
	}

	public Jugador(String nombre, String posicion, String equipo) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", posicion=" + posicion + ", equipo=" + equipo + "]";
	}

}
