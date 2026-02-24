package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoInclusao2 {

	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoInclusao2 () {
		
		String sql = "INSERT INTO game(titulo,ano) VALUES('COD WARZONE', 2020) , "
													+ "('FIFA 14', 2014),"
													+ "('GTA SAN ANDREAS', 2003),"
													+ "('DEVIL MAY CRY', 2010),"
													+ "('ROBLOX', 2020),"
													+ "('FREE FIRE', 2019),"
													+ "('FAR CRY 5', 2022),"
													+ "('BRAWLHALLA', 2017)";
		

		try {
			Connection conexao = DriverManager.getConnection(url, "root" ,"");
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			operacao.execute();
			
			System.out.println("games inseridos com sucesso !");
			conexao.close();
			
		}
		catch (SQLException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
		
}
