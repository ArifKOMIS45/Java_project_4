import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LetterCount {

    /*      Girdiğiniz String parametresinin herbir karakterinin(char) sayısını
            döndüren charCount methodunu yazın
            Örnek:
            String = aabbbcccc
            return     a , 2     olmalı
                       b , 3
                       c , 4
            Not: Stringde herhangi bir char olabilir.  */


    public LinkedHashMap<Character, Integer> charCount(String myStr){

        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i <myStr.length() ; i++) {
            int count=0;
            for (int j = 0; j <myStr.length() ; j++) {
                if (myStr.charAt(i)==myStr.charAt(j))count++;
            result.put(myStr.charAt(i),count);
            }
        }


        return  result;
    }

}









