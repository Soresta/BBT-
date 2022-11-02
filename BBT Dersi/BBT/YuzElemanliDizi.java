import java.util.Scanner;

public class YuzElemanliDizi {
    public static void main(String[] args) {

        //Soru :Klavyeden girilen 100 elemanlı tam sayı dizisindeki pozitif olanların
        //ortalmasını hesaplayan programı  yazınız.

        Scanner read = new Scanner(System.in);//Klavyeden giriş almak için okuycu tanımladık.
        String[] sayilarDizisi = new String[100];//100 elemanlı dizimizi oluşturduk

        //değişkenler.
        int toplam = 0, sayac = 0;
        double ortlama;

        for (int i = 1; i <= 100; i++) {
            System.out.print("Dizinin " + i + ".Sayısını giriniz: ");
            int number = read.nextInt();//dönğünün her turunda klavyeden giriş bekleniyor.
            if (number > 0) {
                toplam = toplam + number;//pozitif sayı girilince toplam değişkenine ekleniyor.
                sayac += 1;//pozitif sayı girilince sayac 1 artıyor.
            }
        }
        ortlama = (double) toplam / sayac;
        System.out.println(ortlama);
    }
}
