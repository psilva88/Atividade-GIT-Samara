// Aluno: Arthur Pereira Silva.
// Professora: Samara Sonale Santos Sampaio.
// Atividade do GitHub / valendo 0,5 / 04/06/2025.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Questão 7 – Sistema de Notas de Alunos

// Você está criando um sistema de lançamento de notas. Use um HashMap<String, Double> para armazenar a nota final de cada aluno, onde a chave é o nome do aluno.

// Crie métodos para:

// · Adicionar ou atualizar a nota de um aluno.

// · Verificar se um aluno está cadastrado.

// · Calcular a média geral da turma.

// · Listar todos os alunos com nota acima de 7.0.
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------

public class MainSistemaNotasAlunos {
    public static void main(String[] args) {
        SistemaNotasAlunos sistema = new SistemaNotasAlunos();

        sistema.adicionarOuAtualizarNota("Pereira", 8.8);
        sistema.adicionarOuAtualizarNota("Helder", 9.5);
        sistema.adicionarOuAtualizarNota("Luiz Gustavo", 8.5);
        sistema.adicionarOuAtualizarNota("Bernardo", 8.9);
        sistema.adicionarOuAtualizarNota("Rodrigo", 9.7);
        sistema.adicionarOuAtualizarNota("Carlinhos", 6.0 );
        sistema.adicionarOuAtualizarNota("Jonerico", 5.7);

        System.out.println("Carlinhos está cadastrado? " + sistema.alunoCadastrado("Carlinhos"));
        System.out.println("Matheus está cadastrado? " + sistema.alunoCadastrado("Matheus"));

        System.out.println("---------------------------------------------------");

        System.out.println("Média da turma: " + sistema.calcularMediaGeral());
        
        System.out.println("---------------------------------------------------");

        System.out.println("Alunos com nota acima de 7.0:");
        for (String aluno : sistema.listarAlunosAcimaDeSete()) {
            System.out.println("- " + aluno);
        }

        System.out.println("---------------------------------------------------");

        System.out.println("Alunos com nota abaixo de 7.0:");
        for (String aluno : sistema.listarAlunosAbaixoDeSete()) {
            System.out.println("- " + aluno);
        }
    }
}