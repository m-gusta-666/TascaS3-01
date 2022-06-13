package n3exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parking p = new Parking();
		p.afegirVehicle(new Cotxe());
		p.afegirVehicle(new Bicicleta());
		p.afegirVehicle(new Avio());
		p.afegirVehicle(new Vaixell());
		
		
		
		for (int i=0 ; i<p.getVehicles().size() ; i++) {
			p.executaOpcio("arrencar", p.getVehicles().get(i));
			p.executaOpcio("accelerar", p.getVehicles().get(i));
			p.executaOpcio("frenar", p.getVehicles().get(i));
			System.out.println();
		}
	
	}
	
	
	
	

}
