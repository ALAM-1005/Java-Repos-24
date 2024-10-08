package CollectionFremwork;

import java.util.LinkedHashMap;
import java.util.Set;


public class MapMain {
    

    public static void main(String[] args) {

        
    Map m =new Map(20);
    Map m1= new Map(   21);

    LinkedHashMap<Map,String> lks = new LinkedHashMap<Map,String>();

    lks.put(m, "Juned");
    lks.put(m1, "alisha");

    Set<Map> keys = lks.keySet();

    for (Map key : keys) {
        System.out.println(key+"-> name:"+lks.get(key));
    }
    }
}
