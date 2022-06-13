package n3exercici1;

public abstract class Command {

	
	protected Vehicle vehicle;
	
	public Command(Vehicle vehicle) {
		
		this.vehicle = vehicle;
	}
	
	abstract void execute();
	
}
