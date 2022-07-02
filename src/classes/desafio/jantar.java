package classes.desafio;

public class jantar {
    
    public static void main(String[] args) {
        
        comida arroz = new comida("arroz", 0.3); 
        comida feijao = new comida("feijão", 0.4);

        pessoa p1 = new pessoa("carlos", 60);
        
        System.out.printf("%s pesa %.2fkg\n", p1.nome, p1.peso);
        
        p1.comer(arroz);
        p1.comer(feijao);

        System.out.printf("depois de comer %.2fkg de %s e %.2fkg de %s\n", 
        arroz.peso, arroz.nome, feijao.peso, feijao.nome);
        System.out.printf("%s agora     pesa %.2fkg\n", p1.nome, p1.peso);
    }
}
