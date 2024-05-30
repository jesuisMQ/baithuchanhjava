import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;
public class arraylist{
    Scanner sc = new Scanner(System.in);
    ArrayList <Integer> arrlist =new ArrayList<>();
    public void themphantu(){
         System.out.print("nhap so phan tu ma ban muon luu:");
        int n =sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu thu"+(i+1));
            int m = sc.nextInt();
            arrlist.add(m);
        }
        System.out.println(arrlist);
    }
     public void tim_max(){
        int max= arrlist.get(0);
        for (int i=1;i<arrlist.size();i++){
            if(arrlist.get(i)>max){
                max=arrlist.get(i);
            }
        }
        System.out.println(max);
    }
    public void themmotphantu(){
     ArrayList <Integer> arrlisttemporary = new ArrayList<>();
     System.out.println("nhap phan tu muon them");
        int f = sc.nextInt();
        arrlist.add(f);
System.out.println("sau khi them:"+arrlist);
for(int i=0;i<arrlist.size()-1;i++){
    if(arrlist.get(i)!=f){
        arrlisttemporary.add(arrlist.get(i));
    }
}
arrlisttemporary.add(arrlist.get(arrlist.size()-1));
System.out.println("sau khi xoa cac phan tu trung gia tri vua nhap:");
System.out.println(arrlisttemporary);
 
Collections.sort(arrlisttemporary);
System.out.print("array sau khi sap xep:");
System.out.print(arrlisttemporary);
    

}
}
