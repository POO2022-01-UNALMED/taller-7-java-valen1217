package comunicacion;

public class Fabula extends Escrito{
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	
	public void setEnsenanza(String ense) {
		this.ensenanza = ense;
	}
	
	public String getEnsenanza() {
		return this.ensenanza;
	}
	
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public int palabrasTotales(int cant) {
		return (this.getPaginas()*cant) * 1;
	}
	

	public String toString() {
		return super.getOrigen() + "\n" +
				super.getTitulo() + "\n" +
				super.getAutor() + "\n" +
				super.getPaginas() + "\n" +
				this.getEnsenanza();
	}
	
	
	
	
	
	
}
