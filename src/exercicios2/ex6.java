package exercicios2;
import java.util.Locale;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		//intervalos 0-25 25-50 50-75 75-100
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double numero = sc.nextDouble();
		
		if ((numero > 0) && (numero < 25.0)) {
			System.out.println("Intervalo 0-25");
		}
		else if ((numero > 25.0) && (numero < 50.0)) {
			System.out.println("intervalo 25-50");
		}
		else if ((numero > 50.0) && (numero < 75.0)) {
			System.out.println("itnervalo 50-75");
		}
		else if ((numero > 75.0) && (numero < 100.0)){
			System.out.println("intervalo 75-100");
		}
		else {
			System.out.println("fora de intervalo");
		}

	}

}
