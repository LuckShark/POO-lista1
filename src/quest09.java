import java.util.Scanner;

public class quest09 {
    //Um usuário deseja um algoritmo onde possa escolher que tipo de média
    // deseja calcular a partir de 3 notas. Faça um algoritmo que leia
    // as notas, a opção escolhida pelo usuário e calcule a média:
    //1 -aritmética
    //2 -ponderada (3,3,4)
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double n1, n2, n3, media;
        int escolha;
        System.out.println("Digite suas notas (enter ou espaço):");
        n1 = aux.nextDouble();
        n2 = aux.nextDouble();
        n3 = aux.nextDouble();
        System.out.println("1-Média Aritmética | 2-Média Ponderada");
        System.out.println("Selecione a opção desejada (1 ou 2):");
        escolha = aux.nextInt();
        if(escolha==1){
            media = (n1+n2+n3)/3;
            System.out.println("Média ART é "+media);
        } else if(escolha==2){
            media = (n1*3 + n2*3 + n3*4)/10;
            System.out.println("Média POND é "+media);
        } else {
            System.out.println("Valor digitado incorreto");
        }


    }
}
