package entities;

public class Entitie_Ex22 {

	private Integer id;
	private String nome;
	private Float salario;
	
	
	
	
	public Entitie_Ex22(int id, String nome, float salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public float getSalario() {
		return salario;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
