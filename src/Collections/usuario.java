package Collections;

public class usuario {
    
    String nome;
    String email;

    usuario(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj instanceof usuario)
        {
            usuario outro = (usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);
        
            return nomeIgual && emailIgual;
        }
        return false;    
    }

    
}
