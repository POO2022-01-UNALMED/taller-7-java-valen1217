package comunicacion;
import java.util.ArrayList;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}

	public void setFecha(String fecha ) {
		this.fecha = fecha;
	}
	
	public String getFecha(){
		return this.fecha;
	}

	public void setPrimica(String primicia ) {
		this.primicia = primicia;
	}
	
	public String getPrimicia(){
		return this.primicia;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	
	public int palabrasTotales(int cant) {
		return (this.getPaginas()*cant) * 10;
	}
		
	public String toString() {
		return super.getOrigen() + "\n" +
				super.getTitulo() + "\n" +
				super.getAutor() + "\n" +
				this.getPaginas()+ "\n" +
				this.getFecha()+ "\n" +
				this.getPrimicia() ;
	}
}
