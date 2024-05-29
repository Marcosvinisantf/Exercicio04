import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá, esse programa vai receber um número INTEIRO.\nE depois imprimir na tela o seu antecessor e o seu sucessor.\n\n--- Digite um número desejado: ");
        int number = sc.nextInt();
        int antecessor = number - 1;
        int sucessor = number + 1;
        System.out.println("O numero digitado foi: " + number + "\nE o seu antecessor é: " + antecessor + "\nE o seu sucessor é: " + sucessor);
    }
}
