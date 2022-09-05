import java.util.Scanner;

public class quest11 {
    //) Faça um algoritmo que, dado as três notas de um aluno,
    // determine e exiba a sua média final e o seu conceito, sabendo-se que:
    //A média final é calculada pela média aritmética das 3 notas;
    //O conceito é determinado com base na tabela
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double n1, n2, n3, media;
        String conceito;
        System.out.println("Digite 3 notas (enter ou espaço p/ cada uma)");
        n1 = Double.parseDouble(aux.nextLine());
        n2 = Double.parseDouble(aux.nextLine());
        n3 = Double.parseDouble(aux.nextLine());
        //Esse codigo abaixo n funcionou:
        //n1 = aux.nextDouble();
        //n2 = aux.nextDouble();
        //n3 = aux.nextDouble();
        media = (n1+n2+n3)/3;
        System.out.println("Media = "+media);
        if(media >= 8.0){
            conceito = "A";
        } else if (media<8.0 && media >=5.0) {
            conceito = "B";
        } else {
            conceito = "C";
        }
        System.out.println("Conceito = "+conceito);
    }
}
