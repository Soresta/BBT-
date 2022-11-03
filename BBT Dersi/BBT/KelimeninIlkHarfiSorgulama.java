import java.util.Scanner;

public class KelimeninIlkHarfiSorgulama {
    public static void main(String[] args) {
        //Klavyeden girilen 10 Stringin arasında 'A' veya 'a' harfleri ile başlayan Stringleri ekrana yazdıran programı yazınız.
        
        Scanner read = new Scanner(System.in);

        int sayac;
        String kelime;

        for (sayac = 0; sayac < 10; sayac++) {
            System.out.print("Kelime giriniz: ");
            kelime = read.nextLine();

            if (kelime.charAt(0) == 'a' || kelime.charAt(0) == 'A') {
                System.out.println(kelime + " 'a harfi ile başlıyor.");
            }
        }
    }
}
