package n3exercici1;

public class Avio extends Vehicle {

	@Override
	void accelerar() {
		System.out.println("Augmentant la potència de les turbines!");

	}

	@Override
	void arrencar() {
		System.out.println("Arrencant motors i escalfant turbines!");

	}

	@Override
	void frenar() {
		System.out.println("Obrint els alerons per reduir velocitat!");

	}

	@Override
	String getTipus() {
		return "AVIO";
	}

}
