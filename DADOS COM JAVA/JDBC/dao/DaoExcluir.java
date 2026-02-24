package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoExcluir {
	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoExcluir () {
		String sql = "DELETE FROM game WHERE id = 14";
		
		try {
			Connection conexao = DriverManager.getConnection(url, "root" ,"");
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("Excluido com sucesso !");
			conexao.close();
			
		}
		catch (SQLException e){
			System.out.println("Erro: " + e.getMessage());
		}
		
	}

}
