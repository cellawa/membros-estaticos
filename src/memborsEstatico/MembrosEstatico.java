package memborsEstatico;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator2;

public class MembrosEstatico {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator2 cal = new Calculator2();
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();

		double c = cal.circumference(radius);
		double v = cal.voLume(radius);
		System.out.printf("Circumference:, %.2f%n", c);
		System.out.printf("voLume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", cal.PI);

		sc.close();
	}

}
