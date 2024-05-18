import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        int numero;
        String titular, agencia;
        Float saldo;

        // Exibir as mensagens para o usuário
        System.out.println("Digite o nome do titular da conta: ");
        titular = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextFloat();

        System.out.println("Olá " + titular + ", obrigado por criar uma conta em nosso banco sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
