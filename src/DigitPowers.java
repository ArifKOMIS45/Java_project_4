import java.util.ArrayList;

public class DigitPowers {
    /*

          Given one method name is power4
          Parameter is one int()
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354

       */


    /*





         Parametresi int ve return tipi int olan power4 isminde method verilmiştir.


        power4 methodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayın


         Örnek: parameter int is 1234

         1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

         result  354 olmalı

      */


        public int power4(int num){

            int toplam=0;
            int a=0;
            for (int i = 1; i <num ; i*=10) {

               a=num/i%10;
            toplam+=Math.pow(a,4);
            }
         return toplam;
        }

}
