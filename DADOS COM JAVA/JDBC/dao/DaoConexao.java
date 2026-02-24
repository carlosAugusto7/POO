package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoConexao {

	static final String url = "jdbc:mysql://localhost";
	
	public DaoConexao() {
		try {
			Connection conexao = DriverManager.getConnection(url, "root" ,"");
			System.out.println("Conexao estabelecida com sucesso !");
			conexao.close();
			
		}
		catch (SQLException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
