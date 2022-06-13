package n3exercici1;

public class ArrencarCommand extends Command {

	

	public ArrencarCommand(Vehicle vehicle) {
		super(vehicle);
		// TODO Auto-generated constructor stub
	}

	@Override
	void execute() {
		
		if (vehicle.getTipus().equals("COTXE")){
			Cotxe cotxe = (Cotxe) vehicle;
			cotxe.arrencar();
		} else if (vehicle.getTipus().equals("BICICLETA")) {
			Bicicleta bici = (Bicicleta) vehicle;
			bici.arrencar();
		} else if (vehicle.getTipus().equals("AVIO")) {
			Avio avio = (Avio) vehicle;
			avio.arrencar();
		} else if (vehicle.getTipus().equals("VAIXELL")) {
			Vaixell vaixell = (Vaixell) vehicle;
			vaixell.arrencar();
		}
		
	}

}
