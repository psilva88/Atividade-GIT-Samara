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

import java.util.*;

	public class SistemaNotasAlunos {
    private HashMap<String, Double> notas;

    public SistemaNotasAlunos() {
        notas = new HashMap<>();
    }

    public void adicionarOuAtualizarNota(String nome, double nota) {
        notas.put(nome, nota);
    }

    public boolean alunoCadastrado(String nome) {
        return notas.containsKey(nome);
    }

    public double calcularMediaGeral() {
        double soma = 0;
        for (double nota : notas.values()) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public List<String> listarAlunosAcimaDeSete() {
        List<String> aprovados = new ArrayList<>();
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() >= 7.0) {
                aprovados.add(entry.getKey());
            }
        }
        return aprovados;
    }
 
    public List<String> listarAlunosAbaixoDeSete () {
        List<String> reprovados = new ArrayList<>();
        for (Map.Entry<String, Double> entry : notas.entrySet()) {
            if (entry.getValue() <= 7.0) {
                reprovados.add(entry.getKey());
            }
        }
        return reprovados;
}
}