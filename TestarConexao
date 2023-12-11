package execucao;

import java.sql.Connection;
import java.sql.SQLException;

import util.Conexao;

public class TestarConexao {

	public static void main(String[] args) throws SQLException {
		Connection conexao = Conexao.getConexao();
		System.out.println("Conexão realizada com sucesso!");
		
		//Fechar a conexão após ser utilizada
		conexao.close();
	}
}
