public class FormatadorCep {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765064");

            System.out.println(cepFormatado);
        } catch (CepInvalidException e) {
            System.out.println("\nO Cep não corresponde as regras de negócio!");
        }               
        

    }

    static String formatarCep(String cep) throws CepInvalidException{

        if(cep.length() != 8)
        throw new CepInvalidException();

        //simulando um cep formatado

        return "23.765-064";
    }
    
}
