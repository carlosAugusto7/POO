package controle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa04{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Digite um numero: ");
			int n1 = input.nextInt();
			System.out.print("Digite outro numero: ");
			int n2 = input.nextInt();
			System.out.print("Divisão: " + n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println("Não é possivel dividir por 0 animal");
			System.out.println("Erro: " + e.getMessage());
		}
		
		catch(InputMismatchException e) {
			System.out.println("A entrada deve ser um numero inteiro");
			System.out.println("Erro: " + e.getMessage());
		}
		
		System.out.println("***** fim do programa *****");
	}
}
