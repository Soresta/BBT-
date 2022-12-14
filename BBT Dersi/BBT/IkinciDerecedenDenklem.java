import java.util.Scanner;

public class IkinciDerecedenDenklem {
    public static void main(String[] args) {
        //a, b ,c değerleri verilen 2 dereceden denklemin köklerini hesaplayan ve bunları ekrana yazdıran programı yazınız.
        
        Scanner read = new Scanner(System.in);
        Double a, b, c, x1, x2, alfa;

        System.out.print("a'nın değerini giriniz: ");
        a = read.nextDouble();

        System.out.print("b'nın değerini giriniz: ");
        b = read.nextDouble();

        System.out.print("c'nın değerini giriniz: ");
        c = read.nextDouble();

        alfa = (b * b) - (4 * a * c);
        if (alfa >= 0) {
            x1 = (-b + Math.sqrt((Double) alfa)) / 2 * a;
            x2 = (-b - Math.sqrt((Double) alfa)) / 2 * a;
            System.out.println("x1 = "x1 + ", x2 =" + x2);
        } else {
            System.out.println("Alfa 0'dan küçük: Reel kök yoktur!");
        }
    }
}
