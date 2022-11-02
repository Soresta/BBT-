import java.util.Scanner;

public class OgrenciOrtalama {
    public static void main(String[] args) {

        byte vizeNot, finalNot, i;
        double ortalama;
        String isim, notu;


        for (i = 0; i < 50; i++) {
            Scanner isimOku = new Scanner(System.in);

            System.out.print("İsim giriniz: ");
            isim = isimOku.nextLine();

            System.out.print("Vize notunuzu giriniz: ");
            vizeNot = isimOku.nextByte();

            System.out.print("Final notunuzu giriniz: ");
            finalNot = isimOku.nextByte();

            ortalama = (vizeNot * 0.4) + (finalNot * 0.6);

            if (finalNot >= 50) {
                if (ortalama >= 50 && ortalama < 70) {
                    notu = "CC";
                    System.out.println(isim + " : not ortalamanız: " + ortalama + ", CC ile Geçtiniz!");
                } else if (ortalama >= 70 && ortalama < 85) {
                    notu = "BB";
                    System.out.println(isim + " : not ortalamanız: " + ortalama + ", BB ile Geçtiniz!");
                } else if (ortalama >= 85 && ortalama < 100) {
                    notu = "AA";
                    System.out.println(isim + " : not ortalamanız: " + ortalama + ", AA ile Geçtiniz!");
                } else {
                    System.out.println(isim + ": Ortalama notunuz: " + ortalama + ", FF ile Kaldınızı!");
                }
            } else {
                System.out.println(isim + ": Final notunuz: " + finalNot + ", FF ile Kaldınızı!");
            }
        }
    }
}