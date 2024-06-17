
import java.util.Scanner;    // utilizaremos Scanner!
import java.util.Locale;

public class AboutMe2 {
    
    public static void main(String[] args){
    // criando o objeto 'scanner'
    Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite seu sobrenome: ");
    String sobreNome = scanner.next();

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    System.out.println("Digite sua altura: ");
    double altura = scanner.nextDouble();

    // imprimindo os dados obtidos pelo usuário.
    System.out.println("Olá eu me chamo " + nome + " " + sobreNome + " tenho " + idade + " anos" + " e possuo " + altura + " de altura.");

    scanner.close();





    }
    
}
