package fundamentos;

public class AreaCirc {
	
	public static void main(String[] args) {
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//a criação de variaveis é igual em C. Com a diferença que caso queiramos criar 
		//constantes, usamos a palavra 'final' ao invés de 'const'.
		
		final double PI= 3.1415;
		int raio = 3;
		double area = PI * raio * raio;
	
		System.out.println(area);
		
		raio = 10;
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// para usar a biblioteca (n sei se esse é o nome em java) Math
		// não precisa dar include, só chamar e bala (nessas mais fundamentais)
		area = PI * Math.pow(raio,2);
		
		System.out.println(area);		
	}
}