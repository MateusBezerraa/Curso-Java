package fundamentos;

import java.util.Date;
//import fundamentos.AreaCircunferencia;

public class importt {

	public static void main(String[] args) {
		
		// em java, quase tudo são classes e objetos, como podemos ver pelos programas criados até agora.
		// Porém, algumas coisas ficam fora das classes (principalemnte coisas relacionadas a controle),
		// e isso ocorre com os imports. 
		
		// por ex, se eu usar a classe Date para criar um novo objeto, ele da erro, então preciso primeiro 
		// importar essa classe com o comando "import java.util.Date;" para depois poder usar
		
		Date d = new Date();
		System.out.println(d);
		
		// posso tambem importar as classes criadas dentro do meu projeto (ou de outros projetos?)
	
		
		// basicamente, é igual em python		
		
		// OBS. CTRL + SHIFT + O --> organiza os imports (exclui o que n ta sendo usado e adiciona os necessarios)
	}
}
