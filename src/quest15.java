import java.util.Scanner;

public class quest15 {
    // Escreva um programa que leia a quantidade de termos a serem
    // exibidas da série de Fibbonacci e mostre os respectivos termos
    public static void main(String[] args) {
        int num1 = 1, num2 = 0, termo;
        Scanner aux = new Scanner(System.in);
        System.out.println("Digite o Xº termo da sequência: ");
        termo = aux.nextInt();
        System.out.println("Termo 1 = "+num2); //1º termo é 0
        System.out.println("Termo 2 = "+num1); //2º termo é 1


        for(int i = 0; i < termo-2; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println("Termo "+(i+3)+" = "+num1);
        }

    }
}
