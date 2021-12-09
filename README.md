# ESTUDO JAVA

## JVM - Java Virtual Machine

Máquina Virtual em Java

- O .NET da Microsoft tem uma arquitetura semelhante ao JVM

## JRE - Ambiente de Execução Java

Ele provê os requisitos mínimos para executar um programa Java.
Nele contém uma JVM (Máquina Virtual), os pacotes básicos do Java
(API core).

O JRE provê ferramentas para executar os programas Java,
como ex. o executável java.exe

## JDK - Kit de Desenvolvimento Java

Ele provê ferramentas para o desenvolvimento de programas Java,
como, um compilador, um depurador e o próprio JRE responsável
por executar os programas.

## Java SE - Java Platform, Standard Edition

> * Inclui o ambiente de execução e as bibliotecas comuns

      > Java EE - Java Platform, Enterprise Edition

> * Edição voltada ao desenvolvimento corporativo e internet

      > Java ME (Java Platform, Micro Edition)

> * Edição voltada ao desenvolvimento mobile e embarcados

## Tipos Primitivos

> byte - Valor inteiro entre - 128 e 127 (inclusivo)
        1 byte

> short - Valor inteiro entre - 32.768 e 32.767 (inclusivo)
        2 byte

> int - Valor inteiro entre - 2.147.483.648 e 2.147.483.647 (inclusivo)
        4 byte

>long - Valor inteiro entre - 9.223.372.036.854.775.808 e9.223.372.036.
854.775.807 (inclusivo)
        8 byte

> float - Valor com ponto flutuante entre 1, 40129846432481707£10¡45 e 3,
40282346638528860 £ 1038 (positivo ou negativo)
        4 byte

> double - Valor com ponto flutuante entre 4, 94065645841246544£10¡324 e
1,79769313486231570£10308 (positivo ou negativo)
        8 byte

> boolean - True ou False
        1 bit

> char - Um único caractere Unicode de 16 bits. Valor inteiro epositivo entre
0 (ou ‘\u0000’) e 65.535 (ou ‘\uffff’)
        2 bytes

## Metodos

O objeto System.in é o que faz a leitura do que se escreve
no teclado.

Veja abaixo como são invocados alguns dos métodos principais que
correspondem com a assinatura que retorna um valor do tipo que
foi invocado.

Ou seja, para cada um dos primitivos existe uma chamada do método
para retornar o valor especificado na entrada de dados, sempre
seguindo o formato.

Scanner entrada = new Scanner(System.in)
float valor = entrada.nextFloat();
int idade = entrada.nextInt();
byte numero = entrada.nextByte();
long lg1 = entrada.nextLong();
boolean status = estrada.nextBoolean();
double numero2 = entrada.nextDouble();
String nome = entrada.nextLine();

%.2f%n > Formata a variável para duas casas decimais

>      ex.: System.out.print("Salário: R$%. 2f%n", salario);

Na tabela abaixo são apresentados os principais métodos da
classe Scanner.

> * Fonte: <<https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448>

## Sintaxe do operador ternário

> #### (expressão booleana) ? código 1 : código 2

Ao avaliar a expressão booleana, caso ela seja verdadeira, o código 1,
declarado após o ponto de interrogação (?) será executado.

Do contrário, o programa irá executar o código 2, declarado após os dois pontos (:).

* obs.:  Ele possui objetivo similar ao do if/else, mas que é codificado
         em apenas uma linha. Normalmente esse operador é utilizado quando
         precisamos de uma estrutura de decisão simples, por exemplo, para iniciar
         uma variável, retornar um valor ou integrar um bloco de código no qual um
         if/else pode torná-lo maior e menos legível.

Os operadores possuem regras que são aplicadas nas
expressões aritméticas do Java, que são as mesmas seguidas
na álgebra.

* Quando dizemos que os operadores são aplicados da
esquerda para a direita, estamos nos rederindo à sua
associatividade. Operadores de multiplicação, divisão e
módulo são aplicados primeiro.

    1 - Aritmético
    (+, -, *, /, %)

    2 - Atribuição
    (=, +=, -=, *=, /=, %=)

        > Simples, Incremental, Decremental, Multiplicativa
        > Divisória, Modular 

    3 - Relacional
    (==, !=, <, <=, >, >=)

    4 - Lógico
    (&&, ||)

## Switch Case

O condicional Switch testa o valor contido em uma variável
e o compara com os valores fornecidos em casa caso,
representados pela palavra reservada case.

* A estrutura switch compara o valor de cada caso como da variável, sequencialmente.
Sempre que encontrar um valor correspondente, executa o código associado ao caso.

ex.:

>     import java.util.Scanner;
>     public class Switch {
>          public static void main(String[] args){
>                Scanner entrada = new Scanner(System.in);
>                int teste;
>                System.out.println("Digite o mês em número inteiro");
>                teste = entrada.nextInt();
>                switch (teste) {
>                case1:
>                     System.out.println("Janeiro");
>                     break;
>                case2:
>                     System.out.println("Fevereiro");
>                     break;
>                case3:
>                     System.out.println("Março");
>                     break;
>                default:
>                System.out.println("Digite um número entre 1 e 3");
>                      break;
>                }        
>          }
>     }

## Estrutura de repetição

As principais estruturas são (FOR, WHILE, DO WHILE)

### Estrutura FOR

Estrutura FOR é dividida em três partes:
        Inicio do loop, Condição de parada e Incremento.

> #### for (i=1;    i<=10;    i++);

### Estrutura WHILE

* Da mesma forma que a FOR a WHILE usa uma condição de
  parada para  finalizar as repetições do seu bloco.

 A grande diferença entre as duas  estruturas é
        que a variável que serve como incremento  no
        caso a variável I deverá ser declarada fora do
        bloco e incrementada dentro deste bloco  e será
        sempre verificada na condicional antes de entrar
        no bloco de comandos.

>        int i = 1; // a variavel inicia com valor 1
>        while(i <= 10) // condição de parada - enquanto
>        {
>        System.out.println(i); // saida no console
>        i++; // a cada loop o valor "i" soma 1
>        }

### Estrutura DO WHILE

>        int i = 1; // variavel inicia com valor 1
>        do // faça
>        {
>            System.out.println(i); // saída no console
>            i++; // a cada loop o valor "i" soma mais 1
>        } 
>        while (i <= 10); // condição de parada - enquanto

* A única diferença é a posição da condição de parada loop

## Array

O Array(vetor) é caracterizado por se tratar de uma única
variável de um determinado tamanho que armazena várias
informações do mesmo tipo.

        * Essas informações são gravadas na memória 
        sequencialmente e são referenciadas através de í
        Chamamos de vetor as variáveis unidimensionais.

A declaração de vetores em linguagem Java deve obedecer as
seguintes sintaxes:

> tipo_de_dado[ ] nome_vetor = new tipo_de_dado [tamanho];

> tipo[ ] nome_vetor = {Lista_de_valores);

O tipo deve ser especificado de acordo com os tipos de dados
que serão armazenados no vetor, como por exemplo int, float,
double, char, string, entre outros.

        * O tamanho representa a quantidade de elementos que
        este vetor será capaz de armazenar.
        A primeira posição ou índice de um vetor é 0 (zero).

## Tratamento de exceções

     * A instrução "try" monitora a execução dos comandos 
     do bloco. 

Caso haja algum erro, esse erro é passado à instrução
"catch" que executa seu bloco de comandos, caso não ocorra
nenhum erro o bloco catch é ignorado, ao final são
executados os comandos do bloco "finally".

Exceção: Uma exceção é qualquer condição de erro ou
comportamento inesperado encontrado por um programa em
execução.

 > Em resumo, try executa um ou mais comandos, caso haja
   algum erro nesta execução o bloco catch é executado,
   no final de tudo o bloco finally é executado.

      > Em Java, uma exceção é um obejto herdado da classe

      ex.: java.lang.Exception
           (o compilador obriga a tratar ou propagar)
           java.lang.RuntimeException
           (o compilador não obriga a tratar ou propagar)

> * Link para estudar sobre: <https://www.devmedia.com.br/blocos-try-catch/7339>

## Paradigma de orientação a objeto

O paradigma da Orientação a Objetos é um modelo de análise,
projeto e programação baseado na abstração entre o mundo real
e o mundo virtual.

      * Ela atua através da criação e interação entre objetos,
      atributos, códigos, métodos, entre outros.

As primeiras linguagens de programação (muitas em uso até hoje)
eram executadas de forma sequencial ou estruturadas em blocos,
iniciando sempre na parte de cima, onde o compilador ou
interpretador passava linha a linha, até alcançar o fim do
arquivo na última.
Esse processo era conhecido como top-down (topo-fundo).

      > A Orientação a Objetos (OO), é chamda de paradigma pois requer uma forma diferente 
      para: Pensar o problema modelar a solução e, construir os algoritmos 

POO tem como princípio básico categorizar e concentrar tudo relacionado à determinado item num único local, chamado de classe.
A classe, então, concentra todas as características de uma entidade qualquer e os chama de atributos.
E tudo o que essa entidade pode realizar, é chamado de método.

 > > Abstração: é a habilidade de se concentrar aos    aspectos essenciais de um contexto qualquer, ignorando as características menos importantes ou acidentais. Em modelagem orientada a objetos, uma classe é uma abstração de entidades existentes no domínio do sistema de software.

UML foi uma padronização de desenhos esquemas para escrita e representação 
de ideias para desenvolvimento de softwares. 

>   - Em programação orientada a objetos, chama-se instância de uma classe, um objeto cujo comportamento e estado são definidos pela classe.

- O objeto surge quando usamos uma estrutura de classe para criar
uma instância de entidade que ela
representa. O objeto passa a ter
todas as propriedades e todas as funcionalidades que a classe especificou.

A POO possui 4 pilares fundamentais para a sua definição e uso:

      1 - Abstração
      2 - Encapsulamento3
      3 - Herança
      4 - Polimorfismo
> Quer saber mais sobre eles? Pesquisa bahiano!

### UML

A UML (Unified Modeling Language ou Linguagem de Modelagem Unificada) é uma linguagem visual utilizada para modelar softwares baseados no paradigma de orientação a objetos.




