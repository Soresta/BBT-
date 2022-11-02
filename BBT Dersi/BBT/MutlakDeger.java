import java.util.Scanner;

public class MutlakDeger {
    public static void main(String[] args) {
        //klavyeden girilen sayının mutlak değerini ekrana yazdıran programı yazınız..
        
        Scanner read = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = read.nextInt();

        if (number < 0) {
            int numberA = -number;
            System.out.println(number + " Sayısının mutlak değeri : " + numberA);
        } else {
            System.out.println(number + " Sayısının mutlak değeri : " + number);
        }
    }
}
