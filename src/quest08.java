import java.util.Scanner;

public class quest08 {
    // Leia um valor inteiro e diga se ele é positivo, negativo ou neutro.
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int x;
        System.out.println("Digite um número para ser analisado:");
        x = aux.nextInt();
        if(x>0){
            System.out.println(x+" é POSITIVO");
        } else if (x<0){
            System.out.println(x+" é NEGATIVO");
        } else {
            System.out.println("0 = NULO");
        }
    }
}
