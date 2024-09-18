import java.util.Scanner;
import java.text.DecimalFormat;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o numero da nova Conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agencia !");
        scanner.nextLine();
        String numeroAgencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o seu Nome Completo !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do deposito inicial na sua nova conta bancaria !");
        double primeiroSaldo = scanner.nextDouble();
            DecimalFormat df = new DecimalFormat("#.##");
            String saldoFormatado = df.format(primeiroSaldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + primeiroSaldo + " já está disponível para saque.");

        scanner.close();
    }
    
}