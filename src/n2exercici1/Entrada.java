package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Entrada {

	private static Scanner sc = new Scanner(System.in);
	
	
	// CAPTURAR AMB InputMismatchException
	
	public static byte llegirByte(String missatge) {
		byte input=0;
		boolean inputCorrecte = false;
		
		
		do {
			System.out.println(missatge);
			try {
				input = sc.nextByte();
				inputCorrecte = true;
			} catch (InputMismatchException e) {
				System.out.println("No s'ha introduït el tipus de dades esperat");
				sc.next();
			}
		} while (!inputCorrecte);
	
		return input;
	}
	
	
	
	public static int llegirInt(String missatge) {
		int input=0;
		boolean inputCorrecte = false;
		
		
		do {
			System.out.println(missatge);
			try {
				input = sc.nextInt();
				inputCorrecte = true;
			} catch (InputMismatchException e) {
				System.out.println("No s'ha introduït el tipus de dades esperat");
				sc.next();
			}
		} while (!inputCorrecte);
		
		return input;
	}
	
	
	public static float llegirFloat(String missatge) {
		float input=0;
		boolean inputCorrecte = false;
	
		
		do {
			System.out.println(missatge);
			try {
				input=sc.nextFloat();
				inputCorrecte = true;
			} catch (InputMismatchException e) {
				System.out.println("No s'ha introduït el tipus de dades esperat");
				sc.next();
			}
		} while (!inputCorrecte);
		
		return input;
	}
	
	
	public static double llegirDouble(String missatge) {
		double input=0;
		boolean inputCorrecte = false;

		
		do {
			System.out.println(missatge);
			try {
				input = sc.nextDouble();
				inputCorrecte = true;
			} catch (InputMismatchException e) {
				System.out.println("No s'ha introduït el tipus de dades esperat");
				sc.next();
			}
		} while (!inputCorrecte);
		
		return input;
	}
	
	
	
	// CAPTURAR AMB Exception
	
	
	public static char llegirChar(String missatge) {
		String inputString = "";
		char resultat='E';
		boolean inputCorrecte = false;
		
		
		do {
			System.out.println(missatge);
			try {
				inputString = sc.nextLine();
				if (inputString.length()==1) {
					resultat = inputString.charAt(0);
					inputCorrecte=true;
				} else {
					throw new Exception("S'ha introduït més d'un caràcter");
				}
			} catch (Exception e) {
				System.out.println("No s'ha introduït el tipus de dades esperat");
				System.out.println(e.getMessage());
			}
		} while (!inputCorrecte);
	
		return resultat;
	}
	
	
	
	
	public static String llegirString(String missatge) {
		String input = "";
		boolean inputCorrecte = false;
		//sc.next();
		
		do {
			System.out.println(missatge);
			try {
				input = sc.nextLine();
				inputCorrecte = true;
				
			} catch (Exception e) {
				System.out.println("Ha fallat algo");
			}
		} while (!inputCorrecte);
		
		return input;
	}
	
	
	public static boolean llegirSiNo(String missatge) {
		
		String resposta = "";
		boolean resultat = false;
		
		do {
			System.out.println(missatge);
			System.out.println("Respon s per cas afirmatiu, o n per cas negatiu");
			resposta = sc.nextLine();
		} while (!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
		
		if (resposta.equalsIgnoreCase("s")) {
			resultat = true;
		} else if (resposta.equalsIgnoreCase("n")) {
			resultat = false;
		}
		return resultat;
	}
	
	
	
	
	
	
	
}
