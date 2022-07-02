package fundamentos;

public class tiposPrimitivos {

	public static void main(String[] args) {
		
		//em java, temos 8 tipos primitivos!!
		//separados da seguinte forma:
		
		/*
		 * 6 numericos, 1 p/ Char e 1 p/ booleano
		 * 
		 * Numericos Inteiros:
		 * 		Byte: menor unidade --> 1 byte
		 * 		Short:	--> 2 bytes
		 * 		Int:	--> 4 bytes
		 * 		Long:	--> 8 bytes
		 * 	
		 * Numericos Reais:
		 * 
		 * 		Float:	--> 4 bytes
		 * 		Double: --> 8 bytes
		 * 
		 * */
	
	
		// OBS: quando passamos um literal (valor definido diretamente no programa, sem pegar de fontes externas. ex int a = 3)
		// caso esse literal seja um inteiro ele vai cair no range do INT, caso seja real vai cair no range do DOUBLE
		// por isso, podemos fazer o 'casting' para o tipo de dado que queiramos, para fazer isso só usar uma letra
		// especifica depois do valor. 
		// EX: long valorGrande = 3_483_940_392 (( isso vai dar erro pq cai no range do int))
		// EX: long valorGrande = 3_483_940_392L (( isso n vai dar erro pq foi feito o cast pra long com o L))
		
		// POREM CONTUDO ENTRETANTO, isso só precisa acontecer caso o valor passado já seja muito grande, pq no momento que
		// aquela linha é compilada, o valor long valorGrande = 3_483_940_392 para de ser inteiro e se torna um long.
	
		// Como o padrao do real é o double, SEMPRE teremos que fazer isso para um float.
		// ou seja, sempre precisamos especificar que é um float colocando a letra F no final do num
	}
}
