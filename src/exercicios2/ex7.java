package exercicios2;
import java.util.Locale;
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		System.out.println("X: ");
		x = sc.nextDouble();
		
		System.out.println("y: ");
		y = sc.nextDouble();
		
		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		}
		else if ((x > 0) && (y > 0)) {
			System.out.println("Q1");
		}
		else if ((x < 0) && (y > 0)) {
			System.out.println("q2");
		}
		else if ((x < 0) && (y < 0)) {
			System.out.println("q3");
		}
		else if ((x > 0) && (y < 0)) {
			System.out.println("q4");
		}

	}

}
