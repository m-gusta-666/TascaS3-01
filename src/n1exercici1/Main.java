package n1exercici1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sortir;
		do {
			System.out.println("introdueix comanda");
			Undo.getInstance().afegirComanda(sc.nextLine());
			System.out.println("0 per sortir");
			sortir = sc.nextInt();
			sc.nextLine();
		} while (sortir!=0);
		
		Undo.getInstance().llistarComandes();
	}

}
