package transporteEscolar;
import java.util.*;
class OnibusEscolar{
    //SERVE APENAS PARA ARMAZENAR A LISTA DE ALUNOS
    ArrayList<Aluno> alunos = new ArrayList<>();
    
    public void adicionarNaLista(Aluno aluno) {
        alunos.add(aluno);
    }
    public boolean removerDaListaPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula.equals(matricula)) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

}
