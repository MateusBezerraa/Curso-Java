package fundamentos;

public class teste_debugg {
    public static void main(String[] args) {
        
        // para usar o debbug, basta clicar no numero da linha
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.printf("[%d - %d]\n", i, j);
            }
        
        // com essas bolinha vermelha ativada, ao executar no modo depuração, o código para toda vez que chega nessa linha
        // e com isso podemos ver os valores das variaveis de todo o programa
        }
    }
}
