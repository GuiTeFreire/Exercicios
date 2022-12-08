package Ex40;

import java.util.Objects;

public class Aluno implements Comparable{
    private long matricula;
    private String nome;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nMatricula = " + matricula + ", Nome = " + nome;
    }

    public int compareTo(Object o){
        if (!(o instanceof Aluno))
            throw new UnsupportedOperationException("Aluno só pode ser comparado com aluno.");

        Aluno a = (Aluno) o;

        if (matricula == a.matricula)
            return 0;
        else if (matricula < a.matricula)
            return -1;
        else
            return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, nome);
    }
}
