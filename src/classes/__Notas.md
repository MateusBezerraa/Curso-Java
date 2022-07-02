### REVISÃO

-- classes definem tipos de dados e seus comportamentos (estrutura dos dados e métodos a serem aplicados no mesmo)
-- a partir das classes podemos instanciar objetos

-- em uma mesma classe podemos ter 2 ou + métodos com o mesmo nome, o que precisa mudar é o tipo de arg ou a qtd (a assinatura)
ex:
void metodo1(int a, int b)
     ---------------------
     --- assinatura ------  



# NOMES

para uma classe publica, o nome do arquivo java tem que ser o mesmo na definição da classe.

# CONSTRUTOR

- Obrigatoriamente tem que ter o mesmo nome da classe
- Não tem retorno (caso tenha retorno passa a ser só mais um método, independente de ter o nome da classe)
- pode-se ter mais de um construtor, desde que as assinatiras sejam diferentes

===============================================================================================================================================

# ACESSOS

- public

- private

- protected

# MODIFICADORES DE ACESSO

STATIC:   - vira uma atributo da classe e não mais das instancias. Pode-se acessar o valor/metodo direto da classe, sem instanciar nada
    a palavra static significa que aquele atributo/método/etc é inerente a classe e todos os objetos terão 
    esse mesmo valor imutável, sem precisar ser criado toda vez (é criado uma vez na memoria e todos os objetos
    pegam esse valor da mesma região da memória -- poupa dor de cabeça com alocação e os krl a 4).

    Para acessar esse valor/metodo sem nenhuma instancia, basta chamar o nome da classe . atributo/metodo 
    (ex: Math.pi ao invés de Math obj1 = new Math; obj1.pi)

FINAL: modificador para definir constantes

# THIS

Palavra chave reservada para acessar o valor/método da instancia.

A outra funcionalidade do this é para chamar um construtor dentro de outro, utilizando o método this()
ex: 
    Construtor(){
        this(1, 2, 3)
    }

    Construtor(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

Nesse exemplo, chamamos o construtor com 3 paramentros dentro do outro construtor, criando uma instancia com 
os valores já definidos.