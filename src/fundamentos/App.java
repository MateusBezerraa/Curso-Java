package fundamentos;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");

        int a = 4;

        //para pegar input
        Scanner teclado = new Scanner(System.in);

        int idade = teclado.nextInt();

        System.out.println(idade);

        System.out.print(a);

        teclado.close();

    
    }
}
