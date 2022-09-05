import java.util.Scanner;

public class quest01 {
    //Elabore um programa que leia a quantidade de chuva em polegadas e imprima a
    //equivalente em milímetros (25,4 mm = 1 polegada).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a qtd de chuva em polegadas:");
        double chuva = Integer.parseInt(scanner.nextLine());
        chuva = chuva*25.4;
        System.out.println(chuva+" mm");
    }
}
