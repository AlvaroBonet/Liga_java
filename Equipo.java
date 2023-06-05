import java.util.ArrayList;

public class Equipo {

	private String nombreequipo;
	private ArrayList<Jugador> plantilla = new ArrayList<Jugador>();

	public Equipo() {
		super();
	}

	public Equipo(String nombreequipo) {
		super();
		this.nombreequipo = nombreequipo;
	}

	public String getNombreequipo() {
		return nombreequipo;
	}

	public void setNombreequipo(String nombreequipo) {
		this.nombreequipo = nombreequipo;
	}

	public ArrayList<Jugador> getPlantilla() {
		return plantilla;
	}

	public void setPlantilla(ArrayList<Jugador> plantilla) {
		this.plantilla = plantilla;
	}

	@Override
	public String toString() {
		return "Equipo [nombreequipo=" + nombreequipo + ", plantilla=" + plantilla + "]";
	}

	public void addJugadores(Jugador item) {

		plantilla.add(item);
	}

	public void delJugadores(Jugador item) {

		plantilla.remove(item);
	}

	public void mostrarPlantilla() {
		for (Jugador elemento : plantilla) {
			System.out.println(elemento.toString());

		}
	}

}
