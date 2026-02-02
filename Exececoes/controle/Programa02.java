package controle;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n1 = input.nextInt();
		System.out.print("Digite outro numero: ");
		int n2 = input.nextInt();
		
		try {
			System.out.print("Divisão: " + n1/n2);
		}
		catch(ArithmeticException e) {
			System.out.println("Nãoo é possivel dividir por 0 animal");
		}
		
		System.out.print("***** fim do programa *****");
		
	}

}
