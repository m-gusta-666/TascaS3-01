package n2exercici1;

public class TelefonFrance implements Telefon {

	private String telefon;
	
	public TelefonFrance() {
		telefon = demanarTelefon();
	}

	@Override
	public String getTelefon() {
		return telefon;
	}

	@Override
	public String demanarTelefon() {
		// TODO Auto-generated method stub
		return "+33"+Entrada.llegirString("Introdueix el telefon");
	}
	
	public String toString() {
		return "Telefon: " + telefon;
		
	}

}
