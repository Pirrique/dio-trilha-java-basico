import java.util.Scanner;
public class Contador { 
    public static void main(String[] args) {
        int num1;
        int num2;
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá. Por favor digite o primero número.");
        num1 = scan.nextInt();
        System.out.println("Agora, digite o segundo número.");
        num2 = scan.nextInt(); 
        System.out.println("-------------------------");
        System.out.println("Os números iterados são:");
        for (int i = (num1 + 1); i <= num2; i++) {
            System.out.println(i);
            cont++;    
        }
        System.out.println("A quantidade de iterações é: " + cont + " números.");
    }
}
