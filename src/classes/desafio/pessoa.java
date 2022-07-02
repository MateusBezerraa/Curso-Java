package classes.desafio;

public class pessoa {
    
    public String nome; 
    public double peso;
    
    pessoa(String nome, double peso)
    {
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(comida comida)
    {
        if(comida != null)
        {
            this.peso += comida.peso;
        }
    }
}
