public class quest12 {
    // Faça um programa que mostre na saída padrão (vídeo)
    // os números múltiplos de 3 entre 0 e 50.
    public static void main(String[] args) {
        System.out.println("Múltiplos de 3");
        int i;
        for (i=0;i<=50;i++){
            if(i%3==0){
                System.out.print(i+" , ");
            }
        }
    }
}
