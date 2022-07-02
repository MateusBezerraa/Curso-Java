package Collections;

import java.util.HashSet;

public class set_baguncado {

    @SuppressWarnings({"rawtypes","unchecked"})
    public static void main(String[] args) {
        
        HashSet conjunto = new HashSet();

        conjunto.add(3.5);
        conjunto.add(true);
        conjunto.add("CAVALO");
        conjunto.add('X');
        conjunto.add(10);
        
        System.out.println("tamanho " + conjunto.size());
        
        conjunto.add("CAVALO");
        conjunto.add('X');
        
        System.out.println("tamanho " + conjunto.size());
        System.out.println("remove" + conjunto.remove("CAVALO"));  // retorna boolean: True == removeu com sucesso
        System.out.println("tamanho " + conjunto.size());
        
        System.out.println("contains: " + conjunto.contains('X'));
    
        //conjunto1.addAll(conjunto2) --> realiza a uniao dos conjuntos e atribui para o conjunto1
        //conjunto1.retainAll(conjunto2) --> realiza a intersecção dos conjuntos e atribui para o conjunto1

        conjunto.clear();
        System.out.println(conjunto);
    }
}
