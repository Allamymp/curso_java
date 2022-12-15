package entities;

public class Entities_Ex20 {
	

	private double altura;
	private String genero;
	
	
	public Entities_Ex20(String genero, double altura) {
		this.genero = genero;
		this.altura = altura;
	}
	
	public String getGenero() {
		
		return genero;
	}
	public double getAltura() {
		return altura;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
