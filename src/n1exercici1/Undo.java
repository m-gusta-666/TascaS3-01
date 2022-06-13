package n1exercici1;

import java.util.ArrayList;

public class Undo {

	//instancia estatica i privada per evitar que es modifiqui 
	private static Undo instance;
	private static int cont;
	private int numCom=1;
	
	//Constructor privat per evitar que es crein mes instancies d'aquesta classe
	private Undo() {
		cont=1;
	}
	
	//Metode que inicialitza la instancia si cal i la retorna
	public static Undo getInstance() {
		
		if (Undo.instance==null) {
			instance = new Undo();
		}
		return instance;
	}
	
	
	// Llista on es guarden les comandes
	private static ArrayList<String> comandes = new ArrayList<String>();
	
	
	// Mètode que afegeix les comandes a la llista després d'esborrar la més antiga si ja n'hi ha 5
	public void afegirComanda(String comanda) {
		if(comandes.size()>=5) {
			comandes.remove(0);
		}
		comandes.add(numCom + " - " + comanda);
		cont++;
		numCom=cont;
	}
	
	// Mètode que imprimeix per pantalla les comandes guardades
	public void llistarComandes() {
		int intr =numCom-1;
		System.out.println("S'han introduït un total de " + intr + " comandes. Llistant les ultimes comandes introduïdes (max. 5)");
		comandes.forEach(System.out::println);
	}
	
	// Mètode que elimina l'última comanda guardada
	public void esborrarUltim() {
		if (comandes.size()>0) {
			comandes.remove(comandes.size()-1);
		} else {
			System.out.println("No hi ha cap comanda per desfer");
		}
	}
	
	
	
}
