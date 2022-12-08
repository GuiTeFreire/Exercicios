package Ex40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Turma {
    private int codigo;
    private String descricao;
    private ArrayList alunos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Turma(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.alunos = new ArrayList<>();
    }

    public void adicionaAluno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome do Aluno: ");
        String nome = teclado.nextLine();
        System.out.println("Matrícula do Aluno: ");
        long matricula = teclado.nextLong();
        Aluno aluno = new Aluno(matricula, nome);
        alunos.add(aluno);
    }

    public void removeAluno(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a matrícula do aluno que deseja remover: ");
        long matricula = teclado.nextLong();
        for (int i = 0; i < alunos.size(); i++){
            Aluno a = (Aluno) alunos.get(i);
            if (a.getMatricula() == matricula)
                alunos.remove(a);
        }
    }

    public void alunosOrdenados(){
        Collections.sort(alunos);
        System.out.println(alunos.toString());
    }

    public void imprimeTurma(){
        System.out.println(this.codigo + "\t" + this.descricao);
        System.out.println(alunos.toString());
    }
}
