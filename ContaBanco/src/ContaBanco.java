import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nBEM-VINDO AO SISTEMA DE CONTA BANCÁRIA!\n\n");

        System.out.println("Digite o número da sua conta: ");
        int numero = sc.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = sc.next();

        double saldo = 237.80;

        System.out.println("Olá " + nome + " " + sobrenome + "!" + " Obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");
        



    }


    
}
