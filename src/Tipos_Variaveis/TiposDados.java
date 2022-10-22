package Tipos_Variaveis;

public class TiposDados {
    public static void main(String[] args){
        byte idade = 123;
        short ano = 2022;
        int cep = 123456789; // se começar com zero, talvez tenha que ser outro tipo
        long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo e Precisa terminar com L
        float pi = 3.14F; // Precisa terminar com F
        double salario = 1275.33;

        // TiposEVariaveis.java
        // Java é fortemente "tipado"

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }

}
