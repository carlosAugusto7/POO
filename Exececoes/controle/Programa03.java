package controle;

import java.util.Scanner;

public class Programa03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String[] nomes = {"Maria", "Mariana" , "gabriel", "Taina", "Fernanda" , "ana"};
		
		System.out.println("Digite um numero de 0 a 5: ");
		int num = input.nextInt();
		
		try {
			System.out.println("Pessoa consultada: " + nomes[num]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.println("O numero deve ser entre 0 e 5");
		}
		
	}

}
