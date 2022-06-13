package n2exercici1;

public class TelefonSpain implements Telefon {

	private String telefon;
	
	public TelefonSpain() {
		telefon = demanarTelefon();
	}

	@Override
	public String getTelefon() {
		return telefon;
	}

	@Override
	public String demanarTelefon() {
		// TODO Auto-generated method stub
		return "+34"+Entrada.llegirString("Introdueix el telefon");
	}
	
	public String toString() {
		return "Telefon: " + telefon;
		
	}
}
