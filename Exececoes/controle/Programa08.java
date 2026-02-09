package controle;

public class Programa08 {
	public static void main(String[] args) {
		String[] nomes = {"Maria", "Gabriel", "Fernanda", null, "Mariana", "Tainá"};
		int i = 0;
		
		while(i < nomes.length) {
			try {
				System.out.println("-> " + nomes[i].toUpperCase());
			}
			finally {
				i++;
			}
		}
	}
}
