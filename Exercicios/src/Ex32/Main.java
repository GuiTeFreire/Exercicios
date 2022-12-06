package Ex32;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        Aluno a1 = new Aluno("Guilherme Freire", "20212210018");
        Aluno a2 = new Aluno("Maria Oliveira", "20212210028");
        Aluno a3 = new Aluno("Gabriel Oliveira", "20212210036");
        Curso c1 = new Curso("BSI", 50);
        c1.matricular(a1);
        c1.matricular(a2);
        c1.matricular(a3);
        c1.imprimir();
    }
}
