import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int d=0;
        int e=0;
        System.out.print("Lütfen bir sayı giriniz: ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {

            int b = i%3;
            int c = i%4;
            if (b == 0 && c == 0) {
                d=d+1;
                e=e+i;
            }
        }
        System.out.println("Ortalama: "+ e/d );
    }
}
