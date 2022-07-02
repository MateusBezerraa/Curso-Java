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


## NÃO SEI SE ENTRA AQUI MAS...

# GENERICS

Adiciona flexibilidade ao java. Com o generics podemos passar um parametro que pega o tipo de dado/objeto

- T (Type)
- podemos usar isso em definições de classes, por exemplo
    Definimos que iremos passar um tipo T para a construção do objeto, e na chamada do construtor
    passamos esse parametro. Com isso, qualquer funcionalidade na classe que tenha o parametro T
    será automaticamente substituido pelo tipo passado.

    Isso se torna util pq podemos ter uma classe generica que pode aceitar "qualquer" tipo de objeto
    
    Outra funcionalidade do Generics é garantir a consistencia dos dados. Por exemplo, podemos
    criar uma lista que guarda qualquer tipo de objeto, porém ao longo do programa podemos perder o controle
    e tentar colocar em um objeto Cachorro um objeto Gato, o que daria erro. Com o Generics, o programa não compila
    e torna mais facil identificar o erro.

    
 
