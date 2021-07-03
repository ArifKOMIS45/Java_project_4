public class _00deneme {

    public static void main(String[] args) {


        int number=349;
        int sayac=1;
        while (number != returnNum(number)) {
            int toplam = 0;
            toplam = number +returnNum(number) ;
            number = toplam;
       sayac++;
        }
        System.out.println("sayac = " + sayac);


    }

    public static int returnNum(int number) {

        int reverse = 0;

        while (number > 0) {
            int kalan = number % 10;
            reverse = reverse * 10 + kalan;
            number = number / 10;
        }

        return reverse;
    }
}