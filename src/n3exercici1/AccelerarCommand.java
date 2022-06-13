package n3exercici1;

public class AccelerarCommand extends Command {

	

	public AccelerarCommand(Vehicle vehicle) {
		super(vehicle);
		
	}

	@Override
	void execute() {
		
		
		if (vehicle.getTipus().equals("COTXE")){
			Cotxe cotxe = (Cotxe) vehicle;
			cotxe.accelerar();
		} else if (vehicle.getTipus().equals("BICICLETA")) {
			Bicicleta bici = (Bicicleta) vehicle;
			bici.accelerar();
		} else if (vehicle.getTipus().equals("AVIO")) {
			Avio avio = (Avio) vehicle;
			avio.accelerar();
		} else if (vehicle.getTipus().equals("VAIXELL")) {
			Vaixell vaixell = (Vaixell) vehicle;
			vaixell.accelerar();
		}

	}

}
