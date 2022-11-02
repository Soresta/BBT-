import java.util.Scanner;

public class Girilen50SayidanEnBuyugu {
    public static void main(String[] args) {
        //Klavyeden girilen 50 tane sayıdan en büyüğünü bulan programı yazınız ..
        
        Scanner read = new Scanner(System.in);
        int enBuyuk, numberA, numberB;

        System.out.print("1. Sayıyı giriniz: ");
        numberA = read.nextInt();
        enBuyuk = numberA;

        for (int i = 2; i <= 50; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            numberB = read.nextInt();
            if (enBuyuk < numberB) {
                enBuyuk = numberB;
            }
        }
        System.out.println("Girilen sayılar arasında en büyük sayı = " + enBuyuk);
    }
}
