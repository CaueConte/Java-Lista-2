package exercicios2;
import java.util.Locale;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		System.out.println("codigo");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante;
		cachorroQuente = 4.0;
		xSalada = 4.50;
		xBacon = 5.0;
		torradaSimples = 2.0;
		refrigerante = 1.50;
		
		int codigo, quantidade;
		System.out.println("digite o codigo do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade do produto: ");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			System.out.println(cachorroQuente * quantidade);
		}
		else if (codigo == 2) {
			System.out.println(xSalada * quantidade);
		}
		else if (codigo == 3) {
			System.out.println(xBacon * quantidade);
		}
		else if ( codigo == 4) {
			System.out.println(torradaSimples * quantidade);
		}
		else if(codigo == 5) {
			System.out.println(refrigerante * quantidade);
		}
		else {
			System.out.println("?");
		}
		

	}

}
