import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi , total = 0, tempsayi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir sayı Girin: ");
        sayi = input.nextInt();
        tempsayi=sayi;
        while (tempsayi != 0) {
            total += tempsayi % 10;
            tempsayi /= 10;
        }
        System.out.println("Girilen Sayının Basamak Sayı değerleri Toplamı.: " + total);
    }
}
