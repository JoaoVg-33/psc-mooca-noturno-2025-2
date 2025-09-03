
import java.util.Scanner;

public class ExemploWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite o numero  para sair");
        numero = sc.nextInt();

        while (numero != 0){
            System.out.println("Você digitou: " + numero);
            System.out.println("Digite para sair");
            numero = sc.nextInt();

            System.out.println("Programa Encerrado");
            sc.close();
        }
    }
}