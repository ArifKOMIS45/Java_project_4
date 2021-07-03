import java.util.HashSet;

public class TotalLength {
    /*
       Parametresi  Set String olan ve Set içindeki Stringlerin uzunluklarının
       toplamını döndüren getTotalLength methodunu yazın.
       retur total
       Örnek:

       Set String "repl" "is" "homework"

       result  14 olmalı

       NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİR

     */

    public int getTotalLength(HashSet<String> mySet){
int toplam=0;
        for (String eleman:mySet) {
            toplam+=eleman.length();
        }
if (toplam==0) toplam=-1;
        return toplam;

    }

}

