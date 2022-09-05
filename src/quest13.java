public class quest13 {
    // Faça um programa que mostre a seguinte saída:
    //1
    //1 2
    //1 2 3
    //...
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=9;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
