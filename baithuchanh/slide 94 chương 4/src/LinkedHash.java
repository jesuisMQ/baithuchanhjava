import java.util.Map;
import java.util.LinkedHashMap;
public class LinkedHash{
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
        hm.put(100,"mo");
        hm.put(101,"dia");
        hm.put(102,"chat");
        for(Map.Entry<Integer,String> m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            System.out.println("before imvoke"+hm);
            hm.remove(101);
            System.out.println("after imvoke"+hm);
        }
    }
}