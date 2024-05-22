import java.util.Scanner;
import java.util.ArrayList;
public class LMQ656Person {
    public int age;
    public String name;
   public double luong;
   Scanner sc =new Scanner(System.in);
  public void nhapthongtin(){
    System.out.println("tuoi la:");
    age= sc.nextInt();
    System.out.println("ten la");
    name=sc.nextLine();
    System.out.println("co luong la:");
    luong=sc.nextDouble();
   }
  public void xuatthongtin(){
    System.out.println("ten la:"+name);
    System.out.println("tuoi la:"+age);
    System.out.println("co luong la:"+luong);
   }

   public static void main(String[] args) {
    
   
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap so luong phan tu:");
    int n= sc.nextInt();
    ArrayList<String> List =new ArrayList<>();
    String m;
    for (int i=0;i<n;i++){
        m=sc.nextLine();
        List.add(m);
        
    }
    for (int i=0;i<n;i++){
        System.out.println("ten doi tuong la:"+List.get(i));
    }
}
}