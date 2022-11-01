package Operadores;

public class Aritmeticos {
    public static void main(String[] args){
        //O operador aritmético é utilizado para realizar operações matemáticas entre valores numéricos, podendo se
        // tornar ou não uma expressão mais complexa.
        //Os operadores aritméticos são: + (adição), - (subtração), * (multiplicação) e / (divisão).

        //classe Operadores.java
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);
        System.out.println("Resultado: " + resultado);
        System.out.println("=====================");

        //ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará
        // a “concatenação de textos”.

        //classe Operadores.java
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    }

}
