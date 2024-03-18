
    // packages
// classes and interfaces
// fields and methods

//public, protected, [nao dizer nada (package-private)], private
import java.util.Scanner;

public class Exercise_001 {

    public static void main(String[] args) {
        System.out.println("Soma de dois números ");
        System.out.println("Digite o primeiro número: ");
        Scanner leitor = new Scanner(System.in);
        int num1 = leitor.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();
        System.out.println("A soma dos números "+ num1+ " + "+ num2+ " é igual a: "+ (num1+num2));

    }
}


