import java.util.Scanner;

public class quest17 {
    //Faça um algoritmo que leia oito nomes e
    // informe a quantidade de letras de cada um deles
    public static void main(String[] args) {
        String n1,n2,n3,n4,n5,n6,n7,n8;
        Scanner aux = new Scanner(System.in);
        System.out.println("Digite 8 nomes (enter ou espaço para cada)");
        n1 = aux.next();
        n2 = aux.next();
        n3 = aux.next();
        n4 = aux.next();
        n5 = aux.next();
        n6 = aux.next();
        n7 = aux.next();
        n8 = aux.next();

        System.out.println(n1+" = "+n1.length()+" letras");
        System.out.println(n2+" = "+n2.length()+" letras");
        System.out.println(n3+" = "+n3.length()+" letras");
        System.out.println(n4+" = "+n4.length()+" letras");
        System.out.println(n5+" = "+n5.length()+" letras");
        System.out.println(n6+" = "+n6.length()+" letras");
        System.out.println(n7+" = "+n7.length()+" letras");
        System.out.println(n8+" = "+n8.length()+" letras");
    }
}
