import java.util.Scanner;

public class KelimeDizisi10x10 {
    public static void main(String[] args) {
        //Soru: Klavyeden girilen 10 boyutlu String dizisindeki ilk karakteri 'a' veya 'A'
        //olan Stringleri ekrana yazan programı yazınız.

        int i, j, m, n;
        String[][] stringDizim = new String[10][10];
        Scanner read = new Scanner(System.in);

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print("Kelime girin: ");
                String kelime = read.nextLine();

                stringDizim[i][j] = kelime;
            }
        }
        for (m = 0; m < 10; m++) {
            for (n = 0; n < 10; n++) {
                char ilkHarf = stringDizim[m][n].charAt(0);
                if (ilkHarf == 'a' || ilkHarf == 'A') {
                    System.out.println(stringDizim[m][n]);
                }
            }
        }
    }
}



