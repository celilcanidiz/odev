import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int k=1 ,i=1,n1,n2,ebob=1, ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz .: ");
        n1 = input.nextInt();
        System.out.print("ikinci sayiyi giriniz .: ");
        n2 = input.nextInt();
        while (i<=n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Ebob : " + ebob);
        System.out.print("Ekok : " + ekok);
    }
}
