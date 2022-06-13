package n2exercici1;

public class ContacteFrance implements ContacteFactory {

	@Override
	public Telefon createTelefon() {
		// TODO Auto-generated method stub
		return new TelefonFrance();
	}

	@Override
	public Direccio createDireccio() {
		// TODO Auto-generated method stub
		return new DireccioFrance();
	}

}
