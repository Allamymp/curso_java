package entities;

public class triangle {

	public double a, b, c;

	public double area() {

		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public void method_print(double a, double b) {

		if (a > b) {
			System.out.printf("Larger area: X");
		} else {
			System.out.printf("Larger area: Y");
		}
	}

}
