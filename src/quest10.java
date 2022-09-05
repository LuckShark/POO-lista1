import java.sql.SQLOutput;
import java.util.Scanner;

public class quest10 {
    //Escreva a conta final contendo: o nome do hóspede,
    // o tipo do apartamento, o número de diárias
    //utilizadas, o valor unitário da diária, o valor total das diárias,
    // o valor do consumo interno, o subtotal, o valor da
    // taxa de serviço e o total geral.
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        String nome, apt;
        int diarias, uniDiaria, totDiaria;
        double consumo, subtotal, total, servico;
        System.out.println("== Sistema Hotel 5 Estrelas ==");
        System.out.println("Nome do hóspede:");
        nome = aux.nextLine();
        System.out.println("Tipo de Quarto (ABCD)");
        apt = aux.next();
        System.out.println("Quantidade de dias: ");
        diarias = aux.nextInt();
        System.out.println("Consumo interno: ");
        consumo = aux.nextDouble();

        if(apt=="A"){
            uniDiaria = 150;
        } else if (apt=="B") {
            uniDiaria = 100;
        } else if (apt=="C") {
            uniDiaria = 75;
        } else {
            uniDiaria = 50;
        }
        totDiaria = uniDiaria*diarias;
        subtotal = totDiaria + consumo;
        servico = subtotal * 0.10;
        total = subtotal + servico;

        System.out.println("Conta do hóspede: "+nome);
        System.out.println("Apartamento "+apt);
        System.out.println("Número de diárias: "+diarias);
        System.out.println("Valor da diária: R$ "+uniDiaria);
        System.out.println("Valor total das diárias: R$ "+totDiaria);
        System.out.println("Valor do consumo interno: R$ "+consumo);
        System.out.println("Subtotal: R$ "+subtotal);
        System.out.println("Taxa de serviço: R$ "+servico);
        System.out.println("Total geral: R$ "+total);
        System.out.println("Obrigado e volte sempre!");


    }
}
