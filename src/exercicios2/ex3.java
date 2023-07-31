package exercicios2;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		//multiplo ou nao
		Scanner sc = new Scanner(System.in);
		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();
		if ((A % B == 0) || (B % A == 0)) {
			System.out.println("multiplo");
		}
		else {
			System.out.println("nao multiplo");
		}

	}

}
