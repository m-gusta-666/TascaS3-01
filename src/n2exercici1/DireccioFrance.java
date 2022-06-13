package n2exercici1;

public class DireccioFrance implements Direccio{

	private String localitat;
	private String codiPostal;
	private final String PAIS = "France";
	
	
	
	public DireccioFrance() {
		
		this.localitat = Entrada.llegirString("Introdueix localitat");
		this.codiPostal = Entrada.llegirString("Introdueix codi postal");
	}



	@Override
	public String toString() {
		return "Direccio [localitat=" + localitat + ", codiPostal=" + codiPostal + ", Pais=" + PAIS + "]";
	}
}
