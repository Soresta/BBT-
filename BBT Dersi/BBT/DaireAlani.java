import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        //Yarıçapı verilen dairenin alanını hesaplayan program..
        
        Scanner read = new Scanner(System.in);//Scanner nesnesi tanımlama.
        
        //değişkenler(alan,yarıçap).
        int radius;
        double area;

        System.out.print("Dairenin yarıçapını giriniz: ");
        radius = read.nextInt();//yarıçapı input olarak alıyoruz.

        if (radius >= 0) {
            area = Math.PI * radius * radius;
            System.out.println("Yarıçapı " + radius + ".Olan dairenin alanı = " + area);
        } else {
            System.out.println("Yarıçap negatif bir sayı olmamalı!");
        }
    }
}
