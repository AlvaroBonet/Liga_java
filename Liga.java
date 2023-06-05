import java.util.Scanner;

public class Liga {

	public static void metJornada() {

		try {

			Scanner lector = new Scanner(System.in);

			int numeroEquipos;
			String[] equipos;
			String[][] enfrentamientos;
			int partidosPorJornada = 0;
			int numeroJornadas = 0;
			do {
				System.out.println("¿Cuantos equipos hay en la liga?");
				numeroEquipos = lector.nextInt();
				if (!esPar(numeroEquipos)) {
					System.out.println("El número de equipos debe ser par.");
				}
			} while (!esPar(numeroEquipos));

			enfrentamientos = new String[numeroEquipos][numeroEquipos];
			equipos = new String[numeroEquipos];
			partidosPorJornada = (numeroEquipos / 2);
			System.out.println("El número de jornadas son: " + (numeroJornadas = numeroEquipos - 1));

			for (int i = 0; i < numeroEquipos; i++) {
				System.out.println("Pon el nombre del equipo " + (i + 1));
				equipos[i] = lector.next();
			}

			System.out.println("Los partidos por jornada son: " + partidosPorJornada);

			for (int i = 0; i < numeroJornadas; i++) {
				for (int j = 0; j < numeroEquipos; j++) {
					enfrentamientos[i][j] = "[ " + equipos[i] + " ] VS [ " + equipos[j] + " ]";
				}
			}
			String[] auxiliar = new String[partidosPorJornada * numeroJornadas];

			int k = 0;
			for (int i = 0; i < numeroEquipos; i++) {
				for (int j = i + 1; j < numeroEquipos; j++) {
					auxiliar[k] = enfrentamientos[i][j];
					k++;
				}
			}

			for (int i = 0; i < partidosPorJornada * numeroJornadas; i++) {
				if (i % partidosPorJornada == 0) {
					System.out.println("Jornada " + ((i / partidosPorJornada) + 1) + ":");
				}
				System.out.println(auxiliar[i]);
			}

		} catch (Exception e) {

			System.out.println("Error, debes introducir un número entero. ");

		} finally {

			System.out.println("El proceso ha terminado.");

		}

	}

	public static boolean esPar(int numeroEquipos) {
		return numeroEquipos % 2 == 0;
	}

}
