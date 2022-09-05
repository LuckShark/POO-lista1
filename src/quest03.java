import java.util.Scanner;

public class quest03 {
    // Leia 2 variáveis A e B, que correspondem a 2 notas de um aluno.
    // A seguir, calcule a média do aluno, sabendo que
    // a nota A tem peso 3,5 e a nota B tem peso 7,5.
    public static void main(String[] args) {
        System.out.println("== Sistema de Notas ==");

        System.out.println("Digite a PRIMEIRA nota:");
        Scanner nota1 = new Scanner(System.in);
        double notaA = nota1.nextDouble();

        System.out.println("Digite a SEGUNDA nota:");
        Scanner nota2 = new Scanner(System.in);
        double notaB = nota2.nextDouble();

        double media = (notaA*3.5 + notaB*7.5)/11;

        System.out.println("A média é "+media);
    }
}
