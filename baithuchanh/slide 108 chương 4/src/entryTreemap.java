import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
public class entryTreemap{
    public static void main(String[] args) {
        TreeMap<Integer,Double>treemap=new TreeMap<>();
        treemap.put(1,9d);
        treemap.put(4,10.1d);
        treemap.put(2,7.2d);
        treemap.put(8,20.28d);
        Set<Map.Entry<Integer,Double>> settreemap = treemap.entrySet();
        System.out.println(settreemap);
        treemap.replace(4,20.11d);
        treemap.replace(2,7.2d,7.7d);
        System.out.println("cac phan tu có trong settreemap la:");
        settreemap= treemap.entrySet();
        System.out.println(settreemap);
    }
}