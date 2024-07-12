public class ExemploBreakContinue {

    public static void main(String[] args) {
        
        for (int numero = 2; numero <= 100; numero++){

            if(!(numero % 2 == 0))
            continue;
    
            System.out.println(numero);


        }


    }
    
}
