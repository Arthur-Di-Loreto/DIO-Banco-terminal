import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Olá, Seja muito bem vindo ao Banco Flux,\no novo Banco via terminal feito para você!");
        System.out.println("Vamos abrir sua conta! primeiro me informe o seu nome:");
        String name = scanner.nextLine();
        System.out.printf("%s qual Agência você deseja: \n (Somente 4 digitos, apenas números)\n", name);
        String agency = scanner.next();
        String agencyP1 = agency.substring(0, 3);
        String agencyP2 = agency.substring(3);
        String agencyFormatted = agencyP1 + "-" + agencyP2;
        System.out.println("Qual o número você deseja para sua conta:");
        int accountNumber = scanner.nextInt();
        System.out.println("Deposite uma quantia para abrir a conta:");
        double balanceAccount = scanner.nextDouble();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco Flux,\nsua agência é %s, conta %s e seu saldo R$%s já está disponível para saque", name, agencyFormatted, accountNumber, balanceAccount);
    }

}
