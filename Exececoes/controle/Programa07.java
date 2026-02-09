package controle;

public class Programa07 {

	public static void main(String[] args) {
		int[] n = {4, 12, 8, 16, 24, 20};
		int[] d = {2, 0, 2, 4, 0, 4};
		int r = 0, soma = 0;
		
		for(int i = 0; i < n.length; i++) {
			try {
				r = n[i] / d[i];
				System.out.println("Divisão: " + r);
			}
			catch(ArithmeticException e) {
				System.out.println("Não é possível dividir por zero!");
				r = 0;
			}
			finally {
				soma += r;
			}
		}
		
		System.out.print("A soma dos quocientes é " + soma);
	}
}
