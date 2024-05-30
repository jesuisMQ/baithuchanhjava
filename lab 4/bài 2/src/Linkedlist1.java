import java.util.LinkedList;
import java.util.Scanner;
public class Linkedlist1{
    public static void main(String[] args) {
    LinkedList <Integer> linkedlist = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap so phan tu can luu:");
    int n= sc.nextInt();
   
    for(int i=0;i<n;i++){
        System.out.println("nhap phan tu thu"+(i+1));
         int m=sc.nextInt();
         linkedlist.add(m);
    }
    int sum=0;
    int dem =0;
    for(int i=0;i<n;i++){
    if(linkedlist.get(i)%2==0){
        dem+=1;
        sum=sum+linkedlist.get(i);
    }
}
int TBC =sum/dem;
System.out.println("trung binh cong="+TBC);
    }
}