package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao1 {

	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoInclusao1 () {
		String sql = "INSERT INTO game(titulo,ano) VALUES('Come-Come!', 1982)";
		

		try {
			Connection conexao = DriverManager.getConnection(url, "root" ,"");
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("game inserido com sucesso !");
			conexao.close();
			
		}
		catch (SQLException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
