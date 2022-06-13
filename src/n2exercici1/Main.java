package n2exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static ArrayList<Contacte> agenda = new ArrayList<Contacte>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		ContacteFactory fabrica;
		String pais = sc.nextLine();
		
		
		if (pais.equalsIgnoreCase("France")) {
			fabrica = new ContacteFrance();
		} else if (pais.equalsIgnoreCase("Spain")) {
			fabrica = new ContacteSpain();
		} else {
			throw new Exception("Error! País desconegut o no vàlid");
		}
		
		Contacte c = new Contacte(fabrica);
	
		
		agenda.add(c);
		System.out.println(agenda);
	}

}
