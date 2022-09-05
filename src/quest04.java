import java.util.Scanner;

public class quest04 {
    //Leia 3 variáveis A e B e C, que são as notas de um aluno.
    // A seguir, calcule a média do
    //aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3
    // e a nota C tem peso 5.
    //ADD - um IF com aprovado ou reprovado
    public static void main(String[] args) {
        System.out.println("Escola X - Sis de Notas");
        System.out.println("Digite a primeira nota: ");
        Scanner nota1 = new Scanner(System.in);
        double notaA = nota1.nextDouble();
        System.out.println("Digite a segunda nota: ");
        Scanner nota2 = new Scanner(System.in);
        double notaB = nota2.nextDouble();
        System.out.println("Digite a terceira nota: ");
        Scanner nota3 = new Scanner(System.in);
        double notaC = nota3.nextDouble();

        double media = (notaA*2 + notaB*3 +notaC*5)/10;
        System.out.println("Média final é: "+media);
        if(media>=7){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
