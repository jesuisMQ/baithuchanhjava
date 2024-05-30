import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class displayentryHashmap{
    public static void main(String[] args) {
        HashMap <String,String> hashmap = new HashMap<>();
        hashmap.put("csdl","co so du lieu");
        hashmap.put("tt","toán tin");
        hashmap.put("oop","object orient program");
        Set<Map.Entry<String,String>> sethashmap = hashmap.entrySet();
        System.out.println("Các entry có trong setHashmap:");
        System.out.println(sethashmap);
    }
}