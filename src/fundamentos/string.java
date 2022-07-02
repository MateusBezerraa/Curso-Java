package fundamentos;

public class string {

	public static void main(String[] args) {
		
		/*
		 métodos de strings:
		 	
		 	.charAt(int) --> retorna o caractere daquele indice
		 	.concat(string) --> concatena a string
		 	.startsWith(string) --> checa se a string começa com o parametro passado (retorna Boolean)
		 	.endsWith(string) --> checa se a string termina com o parametro passado (retorna Boolean)
		 	.toUpperCase() --> coloca todas as letras para maiusculas
		 	.toLowerCase() --> coloca todas as letras para minusculas
		 	.lenght() --> retorna tamanho da string
		 	.equals(string) --> retorna se a string original é igual ao parametro
		 	.equalsIgnoreCase(string) --> retorna se a string original é igual ao parametro sem considerar maiusculo/minusculo 
		 	.format("string", variaveis) --> igual o printf: substitui as variaveis na string (%d: int; %s: string; etc.)
		 	
		 	e muitos outros, ir vendo com o ctrl+space que aparecem todos os méodos e dá pra ter uma boa noção
		 * */
		
		//exemplos 
		String s = "Olá pessoal";
		
		System.out.println(s.charAt(2)); // --> á
		
	}
}
