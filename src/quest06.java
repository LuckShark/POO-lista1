import java.util.Scanner;

public class quest06 {
    // Leia três lados de um triângulo e diga que:
    //i) O triângulo é equilátero se todos os lados forem iguais
    //ii) O triângulo é escaleno se todos os lados forem diferentes
    //iii)O triângulo é isóceles se apenas dois lados forem iguais
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite 3 valores(enter ou espaço p/ cada um)");
        a = aux.nextInt();
        b = aux.nextInt();
        c = aux.nextInt();
        System.out.println("Lado A = "+a+", Lado B = "+b+", Lado C = "+c);
        if(a==b && a==c){
            System.out.println("Equilátero");
        } else if (a==b || b==c) {
            System.out.println("Isóceles");
        } else {
            System.out.println("Escaleno");
        }
    }
}
