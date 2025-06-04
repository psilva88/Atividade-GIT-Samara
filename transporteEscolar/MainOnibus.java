package transporteEscolar;

class MainOnibus extends Aluno {
    public MainOnibus(String nome, String matricula, String endereco) {
		super(nome, matricula, endereco);
	}
    public static void main(String[] args) {
		Aluno sistema = new Aluno("Nome", "Matricula", "Endereço");
        sistema.adicionarAluno();
        sistema.listarAlunos();
        sistema.verificarAluno();
        sistema.removerAluno();
        sistema.listarAlunos();
}
}