import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite 1 numero: ");
        int numero1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        int numero2 = sc.nextInt();

        sc.close();

        System.out.println("Meu nome é " + nome + " e minha idade é " + idade);
        System.out.println("A soma dos numeros digitados sao: " + (numero1 + numero2));
    }
}