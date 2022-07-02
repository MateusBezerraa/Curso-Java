package classes;

public class Produto {
    
    String nome;
    double preco;
    double desconto;
    static final String marca = "Apple";    //totos os produtos seram da marca Apple, e como é constante não poderá sem mudado

    public Produto(String nome, double preco, double desconto)
    // construtor
    {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;        
    }

    public double precoComDesconto()
    //calcula o preço com o desconto
    {
        double valorFinal = preco * (1 - desconto);
        return valorFinal;
    }

    public String dadosFormatados()
    //retorna string com os dados formatados
    {
        return String.format("Produto: %s\nPreço: %.2f\nDesconto: %.0f%%\nMarca: %s",
         this.nome, this.preco, this.desconto*100, Produto.marca);
    }

}

