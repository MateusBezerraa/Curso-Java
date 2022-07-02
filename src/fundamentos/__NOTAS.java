/*

## ARGS NA MAIN

Na main de um programa Java, temos public static void main(String[] args) 

A main recebe esse args como argumento, e ele é util quando executamos o programa através do terminal.
Lá, ao excecutarmos o programa, podemos passar argumento na frente, e isso entra nessa variavel args

ex: 
javac teste.java        --> compilou                                       javac -> java compiler (pega o .java e transforma em .class)
java teste 1 2 3        --> rodou, e o args tem o valor de [1, 2, 3]       java -> executor (chama a maquina virtual java para executar .class)


===============================================================================================================================================

## BREAK E CONTINUE

o break quebra a iteração total, enquanto o continue pula para a próxima

===============================================================================================================================================

## RÓTULO

é possivel dar ródulo para trechos de código e usar esse rótulo em alguns comandos

ex:
    externo: for(int i=0; i<3; i++)
    {
        interno: for(int j=0; j<3; j++)
        {

            if(i == 2)
            {
                break externo
            }
        }
    }

nesse exemplo, nomeia-se os lassos como interno e externo, e usa-se o break externo para sair do lasso do i.
Caso n fosse utilizado esse rótulo, o break iria sair do lasso mais interno e continuar a iteração com o i.

===============================================================================================================================================

*/