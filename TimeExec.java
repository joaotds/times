package execucao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.TimeDAO;
import modelo.Time;


public class TimeExec {

	public static void main(String[] args) 
			throws SQLException {
		Scanner leitor = new Scanner(System.in);
		
		Integer opcao = null;
		do {
			System.out.println();
			System.out.println("------MENU------");
			System.out.println("[1] Inserir Time");
			System.out.println("[2] Listar clientes");
			System.out.println("[3] Buscar cliente");
			System.out.println("[4] Excluir cliente");
			System.out.println("[0] Sair");
			
			System.out.print("Informe a opção: ");
			opcao = Integer.parseInt(leitor.nextLine());
			
			switch (opcao) {
				case 1: 
					inserirTime(leitor);
					break;
				case 2: 
					listarClientes();
					break;
					
				case 3: 
					buscarCliente(leitor);
					break;
					
				case 4: 
					excluirCliente(leitor);
					break;
					
				case 0: 
					System.out.println("Programa encerrado!");
					break;
					
				default:
					System.out.println("Opção inválida!");
			} //Switch
			
		} while(opcao != 0);
		
		leitor.close();
	}

	//Métodos
	private static void inserirTime(Scanner leitor) 
			throws SQLException {
		Time team = new Time();
		
		System.out.print("Informe o nome do time: ");
		team.setNome(leitor.nextLine());
		
		System.out.print("Informe a classificação do time (primeira, segunda, terceira divisao...): ");
		team.setClassificacao(Integer.parseInt(leitor.nextLine()));
		
		System.out.print("Informe o cidade: ");
		team.setCidade(leitor.nextLine());
		
		System.out.print("Quem é o craque: ");
		team.setCraque(leitor.nextLine());
		
		System.out.print("Numero de pontos: ");
		team.setPontos(Integer.parseInt(leitor.nextLine()));
		
		//Persistir o Objeto - salvar no banco
		TimeDAO timDAO = new TimeDAO();
		timDAO.inserirTime(team);
		
		System.out.println("Time inserido com sucesso!");
	}
	
	private static void listarClientes() throws SQLException {
		TimeDAO team = new TimeDAO();
		
		//List<String> lista = team.listarClientes();
		
		//for(team t : lista) {
		//	System.out.println(t.getDados());
		//}
		
		System.out.println("Times listados com sucesso!");
	}
	
	private static void buscarCliente(Scanner leitor) throws SQLException {
		System.out.println("Buscar clientes");
		
		System.out.print("Informe o ID do cliente que você deseja buscar: ");
		Integer idCliente = Integer.parseInt(leitor.nextLine());
		
		//TimeDAO team = new TimeDAO();
		//TimeDAO time = TimeDAO.buscarCliente(idCliente);
		
		//if(team != null) {
		//	System.out.println(team.getDados());
		//} else {
		//	System.out.println("O cliente informado não existe! ");
		//}
	}
	
	private static void excluirCliente(Scanner leitor) {
		System.out.println("Excluir clientes");
		
		
	}

}
