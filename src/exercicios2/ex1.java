package exercicios2;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		//positivo ou negativo
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if(numero>=1) {
			System.out.println("numero positivo");
		}
		else {
			System.out.println("nao positivo");
		}
		

	}

}
