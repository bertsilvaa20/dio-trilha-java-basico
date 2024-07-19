import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo{

    public static void main(String[] args) {
        
        //Criando uma lista de números inteiros

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);


        //Usando o consumer com expressão lambda para imprimir números pares
        
        Consumer<Integer> imprimirNumeroPar = numero ->{
            if(numero % 2 == 0 ){
            System.out.println(numero);
            }
        };

        //Usar o consumer para imprimir números pares no Stream
        numeros.stream().forEach(imprimirNumeroPar);
        


    }

}