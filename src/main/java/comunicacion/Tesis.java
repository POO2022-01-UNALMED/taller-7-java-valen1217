package comunicacion;

import java.util.ArrayList;

public class Tesis extends Escrito{
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public Tesis(String origen,String titulo,String autor,int paginas,String idea, String[] args,String conclusion,String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = args;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public void setIdea(String idea ) {
		this.idea = idea;
	}
	
	public String getIdea(){
		return this.idea;
	}

	public void setArgumentos(String[] args ) {
		this.argumentos = args;
	}
	
	public String[] getArgumentos(){
		return this.argumentos;
	}
	
	public void setConclusion(String conclusion ) {
		this.conclusion = conclusion;
	}
	
	public String getConclusion(){
		return this.conclusion;
	}
	
	public void setReferencias(String referen) {
		this.referencias = referen;
	}
	
	public String getReferencias() {
		return this.referencias;
	}
	
	public void setInterpretacion(String inter) {
		this.interpretacion = inter;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public int palabrasTotales(int cant) {
		return (this.getPaginas()*cant) * 5;
	}
	
	
	public String toString() {
		return super.getOrigen() + "\n" +
				super.getTitulo() + "\n" +
				super.getAutor() + "\n" +
				this.getPaginas()+ "\n" +
				this.getIdea()+ "\n" +
				this.getArgumentos().length+ "\n" +
				this.getConclusion() + "\n" +
				this.getReferencias();
	}











}
