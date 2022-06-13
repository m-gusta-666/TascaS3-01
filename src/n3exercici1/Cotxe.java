package n3exercici1;

public class Cotxe extends Vehicle {

	
	
	@Override
	public void accelerar() {
		System.out.println("Accelerant el cotxe!");

	}

	@Override
	public void arrencar() {
		System.out.println("Arrencant el cotxe!");

	}

	@Override
	public void frenar() {
		System.out.println("Frenant el cotxe!");

	}

	@Override
	String getTipus() {
		return "COTXE";
	}

}
