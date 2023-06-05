import java.util.Scanner;

public class Menu {

	
	public static void portada() {
		System.out.println("  ____           ___   __________    ___________ ");
		System.out.println(" |    |         |   | |          |  |           |");
		System.out.println(" |    |         |   | |     _____|  |    ___    |");
		System.out.println(" |    |         |   | |    |        |   |   |   |");
		System.out.println(" |    |         |   | |    |  ____  |   |___|   |");
		System.out.println(" |    |         |   | |    | |_   | |   _____   |");
		System.out.println(" |    |_______  |   | |    |___|  | |  |     |  |");
		System.out.println(" |            | |   | |           | |  |     |  |");
		System.out.println(" |____________| |___| |___________| |__|     |__|");
		System.out.println("");
	}
	
	public static void menu() {
		
		Scanner lector = new Scanner(System.in);
		int opcion;
		
		System.out.println(); 
		System.out.println("----------------------------");
		System.out.println("|      MENU DE LA LIGA     |");
		System.out.println("----------------------------");
		System.out.println("|    1.- Ver clasificacion |");
		System.out.println("|    2.- Ver Partidos      |");
		System.out.println("|    3.- Modificar equipo  |");
		System.out.println("|    4.- Salir de la liga  |");
		System.out.println("----------------------------");
		opcion = lector.nextInt();
		
		switch(opcion) { 
			case 1:
				Clasificacion.verClasificacion();
				menu();
			break;
			case 2:
				Liga.metJornada();
				menu();
			break;
			case 3:
			break;
			case 4:
				System.out.println("Has salido.");
			break;
			
			default: 
		}

		
	}
	
}
