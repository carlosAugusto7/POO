package controle;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um nome: ");
		String nome = input.nextLine();
		
		try {
			System.out.println("A quinta letra do nome é: " + nome.charAt(4));
		}
		
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("Erro o nome não possui 5 letras");
			System.out.println("Erro:" + e.getMessage());
		}
	}

}
