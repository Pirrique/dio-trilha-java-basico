import java.util.Scanner;
public class Contador { 
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá. Por favor digite o primero número.");
        int num1 = scan.nextInt();
        System.out.println("Agora, digite o segundo número.");
        int num2 = scan.nextInt();
        
        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro.");
        }                
        
    }  
    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num1 > num2) {
        throw new ParametrosInvalidosException();   
    }
    else {
        System.out.println("---------------------------------");
        System.out.println("Os números interados são:");
        int cont = 0;
        
        for (int i = (num1 + 1)  ; i <= num2 ; i++) {
                
            cont++;
            System.out.println("Imprimindo o valor " + i + " da interação " + cont);
        }
        System.out.println("---------------------------------");
        System.out.println("A quantidade de interações são "  + cont + " números.");
        System.out.println("---------------------------------");
        }
    }
}
