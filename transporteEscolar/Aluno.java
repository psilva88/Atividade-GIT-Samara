package transporteEscolar;
import java.util.*;
public class Aluno extends OnibusEscolar {
        Scanner scan = new Scanner(System.in);
        protected String nome;
        protected String matricula;
        protected String endereco;
        public Aluno (String nome, String matricula, String endereco) {
            super();
            this.nome = nome;
            this.matricula = matricula;
            this.endereco = endereco;
        }
    void exibir() {
        System.out.println("Nome: " + nome + " Endereço: " + endereco + " Matrícula: " + matricula);
    }
    void verificarAluno() {
        System.out.println("Digite a matrícula do aluno para verificar se ele está dentro do sistema: ");
        String entrada = scan.nextLine();
        boolean encontrado = false;
        for (Aluno a : alunos) {
            if (a.matricula.equals(entrada)) {
                System.out.println("O aluno " + a.nome + " está cadastrado no sistema.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O aluno não está cadastrado no sistema.");
        }
    }
    void adicionarAluno() {
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();
        System.out.println("Digite a matrícula do aluno: ");
        String matricula = scan.nextLine();
        System.out.println("Digite o endereço do aluno: ");
        String endereco = scan.nextLine();

        Aluno novoAluno = new Aluno(nome, matricula, endereco);
        adicionarNaLista(novoAluno);

        System.out.println("Aluno " + nome + " adicionado com sucesso!");
    }
    void removerAluno() {
        System.out.println("Digite a matrícula do aluno que deseja remover: ");
        String matriculaRemover = scan.nextLine();

        boolean removido = removerDaListaPorMatricula(matriculaRemover);

        if (removido) {
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Matrícula não encontrada.");
        }
    }
    void listarAlunos() {
        System.out.println("Lista de Alunos: ");
        for (Aluno p : alunos) {
	            if (p instanceof Aluno) {
	                p.exibir();
	                System.out.println("-------------------");
	            }
	        }
    }
}