import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações ao usuário
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o saldo conta:");
        int saldo = scanner.nextInt();
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.next();



        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é  " + agencia + " conta  " + numeroConta + " e seu saldo é   " + saldo + " já está disponível para saque");
        
        

        // Fechar o scanner
        scanner.close();
    }
}
