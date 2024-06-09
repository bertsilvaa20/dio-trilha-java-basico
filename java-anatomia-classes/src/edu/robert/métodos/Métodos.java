package edu.robert.métodos;


public class Métodos {
    
    public static void main(String[] args) {

        String primeiroNome = "Robert";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(primeiroNome + " " + segundoNome);

        System.out.println(nomeCompleto);


    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){

        return "Nome Completo: " + primeiroNome.concat(" ").concat(segundoNome);

        // ou (bem mais fácil) "Nome completo: " + primeiroNome + " " + segundoNome;



    }
        


    }
    
