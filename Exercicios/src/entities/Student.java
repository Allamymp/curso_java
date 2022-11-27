package entities;

public class Student {

	public String name;
	public double notaA, notaB, notaC;

	public double nota_final() {
		return notaA + notaB + notaC;
	}

	public double pontos_faltando() {
		if (nota_final() >= 60) {
			System.out.println("PASSOU!");
			return 0.0;
		}
		else {
			System.out.println("REPROVOU!");
			System.out.println("Pontuação faltando: "+ (60-nota_final()));
			return 0;
		}
	}
}