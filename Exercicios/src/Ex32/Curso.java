package Ex32;

public class Curso {
    private String nome;
    private Aluno[] alunos;

    public Curso(String nome, int nrVagas){
        this.nome = nome;
        this.alunos = new Aluno[nrVagas];
    }

    public boolean matricular(Aluno a){
        for (Aluno aluno : this.alunos) {
            if (aluno == null)
                aluno = a;
        }
        return true;
    }
    public boolean cancelarMatricula(long matricula){
        return true;
    }
    public void imprimir(){
        System.out.println(this.nome);
        for (Aluno aluno : this.alunos) {
            if (aluno != null)
                System.out.println(aluno);
        }
    }
}
