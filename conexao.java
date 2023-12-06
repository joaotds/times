package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConexao() {
		Connection conexao = null;
		
		try {
			conexao = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_times",
					"root", "bancodedados");
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco");
			e.printStackTrace();
		}
		
		return conexao;
	}
}
