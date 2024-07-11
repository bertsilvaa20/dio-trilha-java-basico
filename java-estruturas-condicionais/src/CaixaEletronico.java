import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 500.0;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Boa tarde! Quanto você deseja sacar?");
        double valorSolicitado = scanner.nextDouble();

        if (valorSolicitado > saldo) {

            System.out.println("Você solicitou " + valorSolicitado + " reais!");
            System.out.println("Porém infelizmente você não possui esse saldo na conta ;-;");
            System.out.println("\nVocê possui " + saldo + " reais restantes em sua conta.");

        }
        else {

        saldo = saldo - valorSolicitado;

        
        System.out.println("Você solicitou " + valorSolicitado + " reais!");
        System.out.println("\nSacando " + valorSolicitado + " reais de sua conta.");
        System.out.println("\nVocê possui " + saldo + " reais restantes em sua conta.");

        }

        scanner.close();

    }
    
}
