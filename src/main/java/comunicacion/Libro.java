package comunicacion;

public class Libro extends Escrito{
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor,int paginas,String co_autor,String editorial,String edicion,String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
		
	}
	

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	
	public String getCo_autor() {
		return this.co_autor;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEditorial() {
		return this.editorial;
	}
		
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
	
	public String getEdicion() {
		return this.edicion;
	}
	
	public int palabrasTotales(int cant) {
		return (this.getPaginas()*cant) * 2;
 	}
	
	
	public String toString() {
		return super.getOrigen() + "\n" +
				super.getTitulo() + "\n" +
				super.getAutor() + "\n" +
				super.getPaginas() + "\n" +
				this.getCo_autor()+ "\n" +
				this.getEditorial()+ "\n" +
				this.getEdicion();
	}
}
