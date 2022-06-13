package n3exercici1;

public class FrenarCommand extends Command {

	

	public FrenarCommand(Vehicle vehicle) {
		super(vehicle);
		
	}

	@Override
	void execute() {
		
		if (vehicle.getTipus().equals("COTXE")){
			Cotxe cotxe = (Cotxe) vehicle;
			cotxe.frenar();
		} else if (vehicle.getTipus().equals("BICICLETA")) {
			Bicicleta bici = (Bicicleta) vehicle;
			bici.frenar();
		} else if (vehicle.getTipus().equals("AVIO")) {
			Avio avio = (Avio) vehicle;
			avio.frenar();
		} else if (vehicle.getTipus().equals("VAIXELL")) {
			Vaixell vaixell = (Vaixell) vehicle;
			vaixell.frenar();
		}
	}

}
