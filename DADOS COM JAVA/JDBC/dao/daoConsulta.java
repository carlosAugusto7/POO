package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoConsulta {

	static final String url = "jdbc:mysql://localhost/mgu";
	
	public DaoConsulta(){
		String sql = "SELECT * FROM game WHERE id = 3";
		
		try {
			Connection conexao = DriverManager.getConnection(url, "root" ,"");
			
			PreparedStatement operacao = conexao.prepareStatement(sql);
			ResultSet resultado = operacao.executeQuery();
			
			resultado.first();
			System.out.println(resultado.getObject(1) + " | " + resultado.getObject(2) + " (" + resultado.getObject(3) + ")");
			
			conexao.close();
			
		}
		catch (SQLException e){
			System.out.println("Erro: " + e.getMessage());
			
		}
	}	
}
