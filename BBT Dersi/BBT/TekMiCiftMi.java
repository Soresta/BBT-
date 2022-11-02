import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = read.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + ". Sayısı Çift sayıdır.");
        } else {
            System.out.println(number + ". Sayısı Tek sayıdır.");
        }
    }
}
