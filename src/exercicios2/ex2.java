package exercicios2;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		//par impar
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero %2 == 0) {
			System.out.println("par");
		}
		else {
			System.out.println("impar");
		}

	}

}
