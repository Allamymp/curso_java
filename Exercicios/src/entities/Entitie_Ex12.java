package entities;

public class Entitie_Ex12 {
	
	private String name;
	private double altura;
	private int idade;
	
	public Entitie_Ex12(String name, int idade, double altura) {
		
		this.name = name;
		this.altura = altura;
		this.idade = idade;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getAltura() {
		return altura;
	}
	public  void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
