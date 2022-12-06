package Ex31;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coordenadas do ponto 1: ");
        System.out.printf("X: ");
        int x1 = teclado.nextInt();
        System.out.printf("Y: ");
        int y1 = teclado.nextInt();
        System.out.println("Coordenadas do ponto 2: ");
        System.out.printf("X: ");
        int x2 = teclado.nextInt();
        System.out.printf("Y: ");
        int y2 = teclado.nextInt();
        SegmentoReta segmentoReta = new SegmentoReta(x1, y1, x2, y2);
        System.out.println(segmentoReta.tamanho());
    }
}
