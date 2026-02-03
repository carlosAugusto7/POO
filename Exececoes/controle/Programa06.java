package controle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Programa06 {

	public static void main(String[] args) {
		String caminho = "C:/Users/aluno.unilasalle/Documents/arquivo.txt";
		
		try {
			FileInputStream arquivo = new FileInputStream(caminho);
			System.out.println("Arquivo existe no disco");
		}
		catch(FileNotFoundException e) {
			System.out.println("Arquivo não existe no disco");
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
