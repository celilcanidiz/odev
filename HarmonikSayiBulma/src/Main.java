import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double result=0.0;
        System.out.print("Lutfen bir sayi giriniz: ");
        number = input.nextInt();

        for(int i=1; i<=number; i++)
        {
            result += (1.0/i);
        }

        System.out.println("Sonuç: "+ result);
    }
}
