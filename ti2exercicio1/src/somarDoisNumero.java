import java.util.Scanner;

public class somarDoisNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int a = sc.nextInt();  
        System.out.println("Digite um outro número");
        int b = sc.nextInt();  
        int soma = a + b;
        System.out.println("soma = " + soma);   
    }
}
