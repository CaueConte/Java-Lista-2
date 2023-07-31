package exercicios2;
import java.util.Locale;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor;
		valor = sc.nextDouble();
		
		double imposto;
		if ( valor <= 2000) {
			System.out.println("isento");
		}
		else if ((valor >= 2000) && (valor <= 3000)) {
			imposto = (valor - 2000) * 0.08;
		}
		else if ((valor >=3001) && (valor <=4500)) {
			imposto = (valor - 3000) * 0.18 + 1000 * 0.08;
		}
		else if (valor >4500) {
			imposto = (valor - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.println(imposto);
		}

	}

}
