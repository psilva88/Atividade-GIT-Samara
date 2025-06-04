package escola;
import java.util.*;
public class Pessoa {
		protected String nomePessoa;
		protected String cpfPessoa;
		protected String endereçoPessoa;
		public Pessoa(String nomePessoa, String cpfPessoa, String endereçoPessoa) {
			super();
			this.nomePessoa = nomePessoa;
			this.cpfPessoa = cpfPessoa;
			this.endereçoPessoa = endereçoPessoa;
		}	
		public void exibir() {
			System.out.println("nome do meliante: " + nomePessoa + " seu cpf é " + cpfPessoa + " e seu endereço é " + endereçoPessoa);
		}
		protected static ArrayList<Pessoa> pessoas = new ArrayList<>();
		public static void listarAlunos() {
	        System.out.println("Lista de Alunos:");
	        for (Pessoa p : pessoas) {
	            if (p instanceof Aluno) {
	                p.exibir();
	                System.out.println("-------------------");
	            }
	        }
	    }
		public static void listarProfessores() {
	        System.out.println("Lista de Professores:");
	        for (Pessoa p : pessoas) {
	            if (p instanceof Professor) {
	                p.exibir();
	                System.out.println("-------------------");
	            }
	        }
	    }
		
		
}
