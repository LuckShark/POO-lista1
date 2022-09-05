import java.util.Scanner;

public class quest16 {
    //Faça um algoritmo que leia 1 valores para uma N.
    // A seguir, mostre a tabuada de N:
    //1 x N = N
    //2 x N = 2N
    //...
    //10 x N = 10N
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int i, N;
        System.out.println("Digite o valor para iniciar: ");
        N = aux.nextInt();
        for (i=1;i<=10;i++){
            System.out.println(i+" x "+N+" = "+(i*N));
        }
    }
}
