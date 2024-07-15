import java.util.Locale;   // primeira resolução do exercício de Simulação Bancária.
import java.util.Scanner;

public class SimulacaoBancaria {

  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        int opcao;

        do{
        System.out.println("MENU:\n");
        System.out.println("Digite 1 para depositar.");
        System.out.println("Digite 2 para sacar.");
        System.out.println("Digite 3 para consultar saldo.");
        System.out.println("Digite 0 para encerrar o programa.");
        opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                  System.out.println("Digite o valor a ser depositado: ");
                  double valorDeposito = scanner.nextDouble();
                  
                  saldo += valorDeposito;
                  
                  System.out.println(String.format("Saldo atual da conta: %.1f", saldo));
                    
                    break;
                case 2:
                  System.out.println("Qual o valor que você deseja sacar? ");
                  double valorSaque = scanner.nextDouble();
                  if (saldo >= valorSaque){
                    System.out.println("Você possui saldo suficiente.");
                    System.out.println("Sacando " + valorSaque + " da sua conta.");
                    saldo = saldo - valorSaque;
                    System.out.println("Saldo atual da conta: " + saldo);
                  }
                  else{
                    System.out.println("Saldo insuficiente.");
                  }
                    break;
                    
                case 3:
                  
                  System.out.println("Saldo atual da conta: " + saldo);
                break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        
        
    } while (opcao != 0);

    scanner.close();

    }
}
