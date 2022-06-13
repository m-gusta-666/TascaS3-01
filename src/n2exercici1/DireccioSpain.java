package n2exercici1;

public class DireccioSpain implements Direccio {

	private String localitat;
	private String codiPostal;
	private final String PAIS = "España";
	
	public DireccioSpain() {
		
		this.localitat = Entrada.llegirString("Introdueix localitat");
		this.codiPostal = Entrada.llegirString("Introdueix codi postal");
	}

	
	
	
	
	@Override
	public String toString() {
		return "Direccio [localitat=" + localitat + ", codiPostal=" + codiPostal + ", Pais=" + PAIS + "]";
	}
	
	
	
}
