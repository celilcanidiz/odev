import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boy,vki;
        int kg;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz .: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin .: ");
        kg = inp.nextInt();

        vki = kg / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}
