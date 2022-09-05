import java.util.Scanner;

public class quest05 {
    //Leia 4 variáveis A,B,C e D.
    // A seguir, calcule e mostre a diferença do produto de A e B
    //pelo produto de C e D (A*B-C*D)
    public static void main(String[] args) {
        System.out.println("Digite 4 valores (enter p/ cada um)");
        Scanner nota1 = new Scanner(System.in);
        int A = nota1.nextInt();
        Scanner nota2 = new Scanner(System.in);
        int B = nota2.nextInt();
        Scanner nota3 = new Scanner(System.in);
        int C = nota3.nextInt();
        Scanner nota4 = new Scanner(System.in);
        int D = nota4.nextInt();

        System.out.println("Valores: "+A+"x"+B+" - "+C+"x"+D+" =");
        System.out.println((A*B)-(C*D));
    }
}
