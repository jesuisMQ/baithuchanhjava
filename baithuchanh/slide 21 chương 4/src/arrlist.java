import java.util.ArrayList;
public class arrlist{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("q");
        list.add("u");
        list.add("a");
        list.add("n");
        list.set(2,"m");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.contains("n"));
        list.remove(3);
        System.out.println(list);
        list.remove("u");
        System.out.println(list);

    }
    }
    
    
