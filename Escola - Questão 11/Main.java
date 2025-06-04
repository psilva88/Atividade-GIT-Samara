package escola;
import java.util.*;
public class Main extends Pessoa{
	public Main(String nomePessoa, String cpfPessoa, String endereçoPessoa) {
		super(nomePessoa, cpfPessoa, endereçoPessoa);
	}

	public static void main(String[] args) {
		Pessoa Pessoa1 = new Aluno("Arthur Vitor", "957.474.748-90", "Rua Manoel Gomes, 90, bairro receba", 3785492, "Administração");
		Pessoa Pessoa2 = new Professor("Lucas Roupa", "998.490.232.01", "Rua Josçalino Figueiredo, 74, bairro da penha", 238329, "Sociologia");
		

		pessoas.add(Pessoa1);
		pessoas.add(Pessoa2);
		listarProfessores();
		listarAlunos();
	}
}