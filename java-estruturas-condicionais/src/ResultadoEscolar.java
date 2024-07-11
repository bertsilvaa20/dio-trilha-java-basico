import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar { // if else

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7){

            System.out.println("\nSua nota foi: " + nota + "\nParabéns você foi aprovado!");
        }
        else
        System.out.println("\nSua nota foi: " + nota + "\nComo você não atingiu a nota 7, você foi reprovado!");

        scanner.close();
    }
    
}
