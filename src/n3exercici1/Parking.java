package n3exercici1;

import java.util.ArrayList;

public class Parking {

	
	private static ArrayList<Vehicle> vehicles;
	
	
	public Parking() {
		vehicles = new ArrayList<Vehicle>();
	}
	
	
	void afegirVehicle(Vehicle v) {
		vehicles.add(v);
	}
	
	
	ArrayList<Vehicle> getVehicles() {
		return vehicles;
	}
	
	
	
	void executaOpcio(String opcio, Vehicle vehicleActual) {
		opcio = opcio.toLowerCase();
		
		switch(opcio) {
		case "accelerar":
			executarCommand(new AccelerarCommand(vehicleActual));
			break;
		case "arrencar":
			executarCommand(new ArrencarCommand(vehicleActual));
			break;
		case "frenar":
			executarCommand(new FrenarCommand(vehicleActual));
			break;
		default:
			System.out.println("Cap opcio");
		}
	}
	
	
	
	
	static void executarCommand(Command c) {
	
		
		c.execute();
	}
	
}
