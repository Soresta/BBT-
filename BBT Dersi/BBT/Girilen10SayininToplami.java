import java.util.Scanner;

public class Girilen10SayininToplami {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int toplam = 0;

        for (int sayac = 1; sayac <= 10; sayac++) {
            System.out.print(sayac + ". Sayıyı giriniz: ");
            int number = read.nextInt();
            toplam = number + toplam;
        }
        System.out.println("Girilen 10 sayının toplamı = " + toplam);
    }
}
