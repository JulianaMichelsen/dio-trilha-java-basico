import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int conta;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da Conta!");
        conta = sc.nextInt();
        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o Saldo");
        saldo = sc.nextFloat();

        System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é " + saldo + " disponível para saque");

        sc.close();

    }
}
