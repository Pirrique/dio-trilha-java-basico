import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
    
    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Olá. Bem vindo ao seu banco.");
    System.out.println("----------------------------");
    System.out.println("Por favor digite o número da agência.");
    numero = scan.nextInt();
    System.out.println("Agora digite a Agência.");
    agencia = scan.next();
    System.out.println("Digite seu nome completo:");
    nomeCliente = scan.next().toUpperCase();
    System.out.println("----------------------------");
    
    System.out.println("Olá " + nomeCliente + ", obrigado por ter criado uma conta em nosso banco, sua AGÊNCIA é " + agencia + " e seu saldo de R$ " + saldo + " já esta disponível para saque.");
           

    }
}
