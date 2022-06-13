package n2exercici1;

public class ContacteSpain implements ContacteFactory {

	@Override
	public Telefon createTelefon() {
		// TODO Auto-generated method stub
		return new TelefonSpain();
	}

	@Override
	public Direccio createDireccio() {
		// TODO Auto-generated method stub
		return new DireccioSpain();
	}

}
