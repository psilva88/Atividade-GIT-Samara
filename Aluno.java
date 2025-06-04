package escola;

public class Aluno extends Pessoa{
		private Integer matriculaAluno;
		private String cursoAluno;
		public Aluno(String nomePessoa, String cpfPessoa, String endereçoPessoa, Integer matriculaAluno, String cursoAluno) {
			super(nomePessoa, cpfPessoa, endereçoPessoa);
			this.matriculaAluno = matriculaAluno;
			this.cursoAluno = cursoAluno;
		}
		@Override
		public void exibir() {
			super.exibir();
			System.out.println("A matrícula do aluno é: " + matriculaAluno + " e seu curso é " + cursoAluno);
		}
}
