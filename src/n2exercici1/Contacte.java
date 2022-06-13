package n2exercici1;

public class Contacte {

	private ContacteFactory fabrica;
	private Telefon telefon;
	private Direccio direccio;
	
	public Contacte(ContacteFactory fabrica) {
		this.fabrica = fabrica;
		this.telefon = this.fabrica.createTelefon();
		this.direccio = this.fabrica.createDireccio();
	}
	


	@Override
	public String toString() {
		return "Contacte [" + telefon + ";" + direccio + "]";
	}
	
	
}
