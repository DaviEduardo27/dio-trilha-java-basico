package Anatomia_Classes;

public class MinhaClasse {
    public static void main(String[] args) {

        System.out.println("Olá Kyter, Seja bem-vindo!");

        int ano = 2022;
        ano = 2023;
        String BR = "Brasil";
        BR = "Brasil";
        boolean verdadeira = true;
        boolean falsa = false;

        String primeiroNome = "Davi";
        String segundoNome = "Eduardo";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(falsa);
        System.out.println("=============");
        System.out.println(verdadeira);
        System.out.println("=============");
        System.out.println(BR);
        System.out.println("=============");
        System.out.println(ano);
        System.out.println("=============");
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
