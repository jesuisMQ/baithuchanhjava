import java.util.LinkedHashMap;
import java.util.Set;
public class linkedhashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<>();
        lhmap.put(1,"java");
        lhmap.put(2,"c#");
        lhmap.put(3,"c++");
        lhmap.put(4,"Python");
        System.out.println("before remove:");
        System.out.println(lhmap);
        lhmap.remove(3);
        System.out.println("after:");
        show(lhmap);
    }
    public static void show(LinkedHashMap<Integer,String> lhmap){
        Set<Integer> keyset = lhmap.keySet();
        for(Integer key : keyset){
            System.out.println("key"+ lhmap.get(key));
        }

    }
        
    }

