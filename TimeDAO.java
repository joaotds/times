package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import modelo.Time;
import util.Conexao;

public class TimeDAO {

	public void inserirTime(Time team) {
		String sql = 
				"INSERT INTO clientes" +
				   " (nome, classificacao, cidade, craque, pontos)" + 
				" VALUES (?, ?, ?, ?, ?)";
		
		//Acessa a conexão com o banco
		Connection conn = Conexao.getConexao();
		
		//Prepara o SQL para ser executado como uma instrução no banco de dados
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//Seta os parâmetros
		ps.setString(1, team.getNome());
		ps.setInteger(2, team.getClassificacao());
		ps.setString(3, team.getCidade());
		ps.setString(4, team.getCraque());
		ps.setInt(5, team.getPontos());
		
		//Executa a instrução SQL na base de dados
		ps.execute();
		
	}

	

}
