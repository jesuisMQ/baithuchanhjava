import java.util.TreeMap;
import java.util.Set;
import java.util.Map;
public class treemap{
    public static void main(String[] args) {
        TreeMap<Integer,Character> treemap =new TreeMap<>();
        treemap.put(6,'A');
        treemap.put(5,'B');
        treemap.put(1,'C');
        treemap.put(2,'D');
        treemap.put(8,'E');
        Set<Map.Entry<Integer,Character>> setmaptree = treemap.entrySet();
        System.out.println("cac entry có trong setmaptree la:");
        System.out.println(setmaptree);
    }
}