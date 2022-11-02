import java.util.Scanner;

public class PozitifMiNegatifMi {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = read.nextInt();

        if (number >= 0){
            if (number == 0){
                System.out.println("Sayı Nötür'dür: "+ number + " == 0");
            }else {
                System.out.println("Sayı Pozitif'dir: "+ number + " > 0");
            }
        }else {
            System.out.println("Sayı Negatif'dir: "+ number + " < 0");
        }
    }
}
