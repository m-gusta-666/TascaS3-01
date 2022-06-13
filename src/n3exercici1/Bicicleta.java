package n3exercici1;

public class Bicicleta extends Vehicle {

	@Override
	public void accelerar() {
		System.out.println("Canviant de marxa per anar mes rapid!");

	}

	@Override
	public void arrencar() {
		System.out.println("Començant a pedalar!");

	}

	@Override
	public void frenar() {
		System.out.println("Apretant el fre amb força!");

	}

	@Override
	String getTipus() {
		return "BICICLETA";
	}
	
	

}
