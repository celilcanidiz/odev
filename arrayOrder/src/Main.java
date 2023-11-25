import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("dizide kaç eleman olacak : ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
    for (int i = 0; i < n ; i++){
        System.out.print((i+1) + ". Elemanı : ");
        numbers[i] = scanner.nextInt();
    }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
