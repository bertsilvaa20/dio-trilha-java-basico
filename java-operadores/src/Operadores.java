import java.util.Date;

public class Operadores {

    public static void main (String[] args){

        // = 

        String nome = "Robert";
        int idade = 20;
        double peso = 68.2;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date DataDeNascimento = new Date();

        // Operadores aritméticos: (+) (-) (*) (/) (%)

        double soma = 10.5 + 15.7;
        int subtração = 8 - 6;
        int multiplicacao = 13 * 20;
        int divisao = 73 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 8) + (20 / 4);

        // O operador '+' também serve para concatenar(juntar) duas Strings(textos).

        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

        // Teste concatenacao(debug)

        String concatenacao = "?";

        System.out.println(concatenacao);

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

        // Transformar um número positivo em negativo e depois torná-lo positivo novamente

        int numero = 5;

        numero = - numero;

        numero = numero * (-1);

        System.out.println(numero);

        // Incremento (++) e (!)

        int numeroo = 6;

        System.out.println(++numeroo);

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);

        // Operador ternário (condição ? se verdadeiro isso será imprimido : se falso isso será imprimido)

        int a, b;

        a = 6;
        b = 6; 

        //comentárioString resultadoo = a == b ? "verdadeiro" : "falso";
        
        int resultadooo = a == b ? 1 : 0; 

        //comentárioSystem.out.println(resultadoo);
        System.out.println(resultadooo);

        // Comparação

        String nomeUm = "Robert";
        String nomeDois = new String("Robert");

        System.out.println(nomeUm.equals(nomeDois)); // costumamos utilizar 'equals' quando estamos comparando objetos ou strings pois ele compara o conteúdo de ambas
        //System.out.println(nomeUm == nomeDois); X X X X X X X

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 != numero2){

            System.out.println("A nossa condição é verdadeira!");
        }
        else 

        System.out.println("A nossa condição é falsa!");


        System.out.println("Numero1 é igual a Numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente do Numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que Numero2? " + simNao);


        // Operadores lógicos ('&&' equivale ao 'e' as '||' equivalem ao 'ou')

        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        }

        if (condicao1 && (7 > 4)){

            System.out.println("As duas condições são verdadeiras!(podemos usar inteiros também!)");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma duas condições é verdadeira!");
        }

        System.out.println("fim");



    }


}