/*
 * desafio: printar o A:
 * 
 * a variavel A é da instancia, portanto, mesmo estando dentro da classe em que ela é definida,
 * não é possivel acessar diretamente, como é uma variavel de instancia (não tem o static)
 * é necessario instanciar um objeto para poder acessar o valor
 * 
 * com b é diferente pois é uma var da classe, podendo acessar normalmente
*/

package classes;

public class var_instancia_vs_var_classe {
    
    int a = 3;
    static int b = 2;

    public static void main(String[] args) {
        
        var_instancia_vs_var_classe p = new var_instancia_vs_var_classe();
        System.out.println(p.a);
        
        System.out.println(b);
    }
}
