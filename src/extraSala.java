import java.util.Scanner;

public class extraSala {
    //receber nome, sobrenome, data de aniversário
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int dia, mes, ano;
        String nome, sobrenome;
        System.out.println("Diga seu nome e sobrenome:");
        nome = aux.next();
        sobrenome = aux.next();
        System.out.println("Diga sua data de aniversário D M A");
        dia = aux.nextInt();
        mes = aux.nextInt();
        ano = aux.nextInt();
        int idade = 2022 - ano;
        System.out.println(nome+" "+sobrenome+", nasceu em "
                +dia+"/"+mes+"/"+ano+" e tem "+idade+" anos.");
    }
}
