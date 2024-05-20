import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ListIterator;
public class linkedlist {


    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap so phan tu");
        int n=sc.nextInt();
     
        for(int i=0;i<n;i++){
            System.out.println("nhap phan tu thu "+(i+1));
            int m=sc.nextInt();
            list.add(m);
        }
        for(int i=0; i<n;i++){
            System.out.println(list.get(i));
        }
        for(int  number : list){
            System.out.println(number);
        }
        Iterator<Integer> Iterator= list.iterator();
        while (Iterator.hasNext()) {
        System.out.println(Iterator.next());
        }
        ListIterator<Integer> ListIterator = list.listIterator();
        while(ListIterator.hasNext()){
        System.out.println(ListIterator.next());
        }
}
}

    
