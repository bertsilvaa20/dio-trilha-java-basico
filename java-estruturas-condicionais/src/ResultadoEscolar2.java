import java.util.Locale;
import java.util.Scanner;

public class ResultadoEscolar2 { // else if

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 7){

            System.out.println("\nSua nota foi: " + nota + "\nParabéns você foi aprovado!");
        }

        else if (nota >= 5 && nota < 7){ //true ou false

            System.out.println("\nSua nota foi: " + nota + "\nVocê está de recuperação! Boa sorte!");



        }
        else

        
        System.out.println("\nSua nota foi: " + nota + "\nComo você não atingiu pelo menos a nota 5, você foi reprovado!");

        scanner.close();

        }
    }
    
