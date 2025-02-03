import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Por favor, digite a sua Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite seu Nome!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu Saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
    }
}
