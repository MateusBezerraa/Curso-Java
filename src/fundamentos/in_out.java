package fundamentos;

import java.util.Scanner;

public class in_out {

	public static void main(String[] args) {
		
		////tipos de print:
		System.out.println("Bom dia"); //printa o conteudo e adiciona um \n no final
		System.out.print("Boa tarde"); //printa o conteudo e n adiciona nada
		System.out.println();
		System.out.printf("Resultado: %d%d%d%d", 1, 2, 3, 4); //printa o conteudo formatado
		System.out.println();
	
		
		////leitura de dados 
		
		//import do Scanner e criação de um objeto scanner, chamado entrada, que irá ler através do System.in (teclado)
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite seu nome: ");
		// metodo para 'entrada' ler a linha, e guardar o resultado na string 'nome'	
		String nome = entrada.nextLine(); //metodo 'nextLine()' retorna string
		// esse metodo lê tudo que está no buffer até encontrar um \n
		
		//OBS. O que é um Buffer?
		
		// Buffer, em geral, é uma fila de dados!
		// E esses dados são armazenados temporariamente enquando vão de um lugar ao outro
		
		// No caso do Buffer de entrada, que é a fila de coisas que devem ser lidas.
		// Exemplo: se digitarmos alguma coisa e dermos enter o buffer terá todas essas coisas 
		// digitadas mais o \n do enter, e caso usemos um método que pegue tudo menos o \n do final,
		// o buffer ficara somente com um \n, e no proximo método que usarmos isso será a primeira coisa que ele irá pegar
		
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt(); // método 'nextInt()' retorna um inteiro
		
		System.out.printf("\n\n%s tem %d anos", nome, idade);
		
		// fechando o scanner para econommizar recursos (igual arquivos em C)
		entrada.close();
	}
}
