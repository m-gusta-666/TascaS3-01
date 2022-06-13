package n3exercici1;

public class Vaixell extends Vehicle {

	@Override
	void accelerar() {
		System.out.println("Accelerant el vaixell! A tota vela");

	}

	@Override
	void arrencar() {
		System.out.println("Llevant l'àncora! Hissant veles!");

	}

	@Override
	void frenar() {
		System.out.println("Arriant veles!");

	}

	@Override
	String getTipus() {
		return "VAIXELL";
	}

}
