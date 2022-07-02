package classes;

public class produtoMain {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto("ipad9", 2500, 0.70);

        System.out.println(p1.dadosFormatados());
    }
}
