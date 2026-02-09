package controle;

import modelo.Cliente;

public class ControleCliente {

	public static void main(String[] args) {
		Cliente cli;
		cli = null;
		//cli = new Cliente("09876543212", "Fernanda");
		
		try {
			cli.setCpf("98765432109");
			cli.setNome("Fernanda");
			System.out.println("CPF: " + cli.getCpf());
			System.out.print("Nome: " + cli.getNome());
		}
		catch(NullPointerException e) {
			System.out.println("Objeto não foi criado!");
			System.out.println("Erro: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
