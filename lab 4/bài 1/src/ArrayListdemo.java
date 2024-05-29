import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayListdemo {
    public static void main(String[] args) {
        ArrayList<Integer> Arraylist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;
    
        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
    
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + i );
            number = sc.nextInt();
            Arraylist.add(number);
            
        }
        int max = Arraylist.get(0);
    
        for (int i =1 ; i<Arraylist.size();i++){
    
            if(Arraylist.get(i).compareTo(max) > 0) {
                max = Arraylist.get(i);
                Collections.sort(Arraylist);
            }
        }
        ArrayList<Integer> arraylist1 = new ArrayList<>();
    
    
        for (int i =0 ; i<Arraylist.size();i++){
    
            if(!arraylist1.contains(Arraylist.get(i))) {
                arraylist1.add(Arraylist.get(i));
                
            }
        }
        Arraylist.clear();
        Arraylist.addAll(arraylist1);
        
        System.out.println("phan tu lon nhat trong Arraylist = " + max);
        System.out.println("Cac phan tu co trong arraylist la :");
        System.out.println(Arraylist);
        }
}