
public class Clasificacion extends Liga{

	private String victoria;
	private String derrota;
	private String empate;
	private String puntos;
	private String equipo;

	public Clasificacion(String victoria, String derrota, String empate, String puntos, String equipo) {
		super();
		this.victoria = victoria;
		this.derrota = derrota;
		this.empate = empate;
		this.puntos = puntos;
		this.equipo = equipo;
	}

	public String getVictoria() {
		return victoria;
	}

	public void setVictoria(String victoria) {
		this.victoria = victoria;
	}

	public String getDerrota() {
		return derrota;
	}

	public void setDerrota(String derrota) {
		this.derrota = derrota;
	}

	public String getEmpate() {
		return empate;
	}

	public void setEmpate(String empate) {
		this.empate = empate;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Clasificacion [victoria=" + victoria + ", derrota=" + derrota + ", empate=" + empate + ", puntos="
				+ puntos + ", equipo=" + equipo + "]";
	}
	
	public static void verClasificacion() {
		
		// REFERENCIA: https://www.youtube.com/watch?v=N220Gzl3XFs&t=521s
		
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|", "Equipo", "PG", "PE", "PP", "Puntos");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|", "A", "5", "1", "0", "16");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|", "B", "3", "0", "3", "9");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|", "C", "0", "1", "5", "1");
		System.out.println();
		System.out.printf("|%10s|%10s|%10s|%10s|%10s|", "D", "0", "0", "6", "0");
		System.out.println();
		
		
		
	}

}
