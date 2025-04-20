import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Mensagem final
        System.out.println("Olá " + nomeCliente + 
            ", obrigado por criar uma conta em nosso banco. Sua agência é " + 
            agencia + ", conta " + numero + 
            " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
