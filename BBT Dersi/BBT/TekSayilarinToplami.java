import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int toplam = 0;

        for (int sayac = 1; sayac <= 10; sayac++) {
            System.out.print(sayac + ". Sayıyı giriniz: ");
            int number = read.nextInt();

            if (number % 2 == 1) {
                toplam = number + toplam;
            } else {
                continue;
            }
        }
        System.out.println("Girilen sayılardan Tek olan sayıların  toplamı = " + toplam);
    }
}


