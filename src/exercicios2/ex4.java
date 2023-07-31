package exercicios2;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicioJogo, finalJogo, calculo;
		System.out.println("digite o inicio do jogo: ");
		inicioJogo = sc.nextInt();
		
		System.out.println("Digite o final do jogo: ");
		finalJogo = sc.nextInt();
		if (inicioJogo > finalJogo) {
			calculo = inicioJogo - finalJogo;
		}
		else {
			calculo = 24 - inicioJogo + finalJogo;
		}
		
		System.out.println("durou: " +calculo+" horas");
		


	}

}
