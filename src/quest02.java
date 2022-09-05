import java.util.Scanner;

public class quest02 {
    // Dados dois lados de um triângulo retângulo, faça um programa para calcular a
    //hipotenusa.
    public static void main(String[] args) {
        Scanner lado1 =  new Scanner(System.in);
        System.out.println("Digite o valor do 1º lado");
        int ladoUm = Integer.parseInt(lado1.nextLine());

        Scanner lado2 =  new Scanner(System.in);
        System.out.println("Digite o valor do 2º lado");
        int ladoDois = Integer.parseInt(lado2.nextLine());

        float hipotenusa = (float) Math.sqrt((ladoUm*ladoUm) + (ladoDois*ladoDois));

        System.out.println(hipotenusa);

    }
}
