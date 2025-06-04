package escola;

public class Professor extends Pessoa{
		private Integer siapeProfessor;
		private String disciplinaProfessor;

		public Professor(String nomePessoa, String cpfPessoa, String endereçoPessoa, Integer siapeProfessor, String disciplinaProfessor) {
			super(nomePessoa, cpfPessoa, endereçoPessoa);
			this.siapeProfessor = siapeProfessor;
			this.disciplinaProfessor = disciplinaProfessor;
		}
		@Override
		public void exibir() {
			super.exibir();
			System.out.println("A siape do professor é " + siapeProfessor + " e sua disciplina é " + disciplinaProfessor);
		}
}
