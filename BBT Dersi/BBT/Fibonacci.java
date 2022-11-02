public class Fibonacci {
    //1 1 2 3 5 8 ... diye ilerleyen Fibonacci serisinin ilk 50 terimini yazınız!
    public static void main(String[] args) {
        int num1, num2, sayac;
        long totalresult;

        num1 = 0;
        num2 = 1;

        System.out.println("1: " + 1);
        for (sayac = 2; sayac <= 50; sayac++) {
            totalresult = num1 + num2;
            System.out.println(sayac + ": " + totalresult);
            num1 = num2;
            num2 = (int) totalresult;

        }
    }
}
