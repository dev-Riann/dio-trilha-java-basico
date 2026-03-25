import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scan.next();

        scan.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scan.nextDouble();

        System.out.println("");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia.replaceFirst("()", "") + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");

        scan.close();
    }
}
