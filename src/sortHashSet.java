import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sortHashSet {
    /* allNumbers Integer Hashset  verildiğinde
         allNumbers hashset'i sort et
        Sonucu ArrayList olarak değiştir
        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TİPLERINI KULLANIN
     */
    public ArrayList<Integer> sort(HashSet<Integer> allNumbers){
       TreeSet<Integer> sirali=new TreeSet<>(allNumbers);

        return new ArrayList<>(sirali);
    }

}
