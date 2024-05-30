import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class getvalue {
    public static void main(String[] args) {

HashMap<String, String> hashMap = new HashMap<>();
hashMap.put("QN", "Quang Ninh");
hashMap.put("TPHCM", "TP. Hồ Chí Minh");
System.out.println("Danh sách các thành phố trong hashMap: "); 
Set<Map.Entry<String, String>> sethashmap = hashMap.entrySet(); 
System.out.println(sethashmap);

System.out.println("QNg: " + hashMap.get("QN"));

System.out.println("TPHCM: " + hashMap.get("TPHCM"));

if (hashMap.containsValue("TP. Hồ Chí Minh")) {

System.out.println("Có Thành phố Hồ Chí Minh trong hashMap");
}
    
}
}