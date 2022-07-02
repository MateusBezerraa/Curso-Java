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


===============================================================================================================================================


### COLLECTIONS

# array

- tamanho fixo, informado na criação do array (pode-se mudar a referencia da variavel (a[6] virar a[10])
 porém isso cria uma novo array e destarta o antigo, ao invés de alterar o tamanho do original).

 - homogeneo (todos os dados do array são do mesmo tipo)
 
diferente do C, para declarar um array em Java é assim:
    int[] a; --> o colchetes vem antes da variavel
e para definir o tamanho:
    int[] a = new int[10];  --> vetor de inteiros de tamanho 10

# forEach

em java, podemos iterar com o foreach dessa forma:

for(tipo var: estrutura){...}
ex: double[] notas = {1.2, 3.4, 3.6, 9.1};
    for(double nota: notas){...}

# Equals e HashCode

Utilizado para comparar dois objetos. HashCode de forma muito mais rapida, comparando somente um aspecto
e o equals comparando todos os atrbutos do objeto

é necessario utilizar o polimorfismo e implementar o metodo equals para comparar os objetos desejados, pois
por padrão, ele é igual ao "==", ou seja, compara ops endereços de memoria dos objetos


# Set

Conjunto de elementos:
- não aceita duplicadas;
- pode inserir qualquer tipo de elemento;
- dados primitivos são tranformados em objetos (int -> Integer);

------------------------------------------------------
## NÃO SEI SE ENTRA AQUI MAS...

# GENERICS

Adiciona flexibilidade ao java. Com o generics podemos passar um parametro que pega o tipo de dado/objeto

- T (Type)
- podemos usar isso em definições de classes, por exemplo
    Definimos que iremos passar um tipo T para a construção do objeto, e na chamada do construtor
    passamos esse parametro. Com isso, qualquer funcionalidade na classe que tenha o parametro T
    será automaticamente substituido pelo tipo passado.

