import java.util.Scanner;

public class quest07 {
    // Leia um valor inteiro X e diga se ele é par ou ímpar.
    public static void main(String[] args) {
        int x;
        System.out.println("Digite um número: ");
        Scanner aux = new Scanner(System.in);
        x = aux.nextInt();
        if(x%2==0){
            System.out.println(x+" é PAR");
        } else {
            System.out.println(x+" é ÍMPAR");
        }
    }
}
