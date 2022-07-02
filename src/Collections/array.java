package Collections;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner stdin = new Scanner(System.in);

        System.out.println("insira qtd de notas: ");
        int qtdNotas = stdin.nextInt();

        /*declaração de array*/
        double[] notas = new double[qtdNotas];
       
        System.out.println("insira as notas");
        for(int i = 0; i < notas.length; i++)
        {
            notas[i] = stdin.nextDouble();
        }
        
        System.out.print("média: ");
        double total = 0;
        for(double nota: notas)
        {
            total += nota;
        }

        System.out.println("A média de nota é " + total/notas.length);
        stdin.close();
    }
}
