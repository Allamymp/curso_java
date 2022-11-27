package entities;

public class employee {

	public String name;
	public double grossSalary;
	public double tax;

	public  void  netSalary() {
		System.out.println("Nome: " + name + ", $ " + (grossSalary-tax));
		

	}

	public void increaseSalary(double percentage) {
		grossSalary = grossSalary + grossSalary*(percentage/100);
		System.out.println("Updated data: "+ name +", $ "+ (grossSalary-tax));
	}
}
