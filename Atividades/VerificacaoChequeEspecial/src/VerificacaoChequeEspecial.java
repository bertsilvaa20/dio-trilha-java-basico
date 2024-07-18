import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double LIMITE_CHEQUE_ESPECIAL = 500.0;

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
          System.out.println("Transacao realizada com sucesso.");
            // TODO: Imprimir "Transação realizada com sucesso."
        } else {
            double saldoComChequeEspecial = saldo + LIMITE_CHEQUE_ESPECIAL;

          if (saque <= saldoComChequeEspecial) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            
          } else {
            // Saque ultrapassa o limite do cheque especial
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }
            // TODO: Verificar se o saque ultrapassa o limite do cheque especial
            // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            scanner.close();
        }

        // Fechar o scanner para evitar vazamentos de recursos

    }
}
