import java.util.Scanner;
import java.util.ArrayList;
public class LMQ656Person {
    public int age;
    public String name;
   public double luong;
   Scanner sc =new Scanner(System.in);
  public void nhapthongtin(){
    System.out.print("tuoi la:");
    age= sc.nextInt();
    System.out.print("ten la");
    name=sc.nextLine();
    System.out.print("co luong la:");
    luong=sc.nextDouble();
   }
  public void xuatthongtin(){
    System.out.println("ten la:"+name);
    System.out.println("tuoi la:"+age);
    System.out.println("co luong la:"+luong);
   }
   public void themphantu(,n){
    ArrayList<Person> ps =new ArrayList<>();
   }

   public static void main(String[] args) {
    
   
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap so luong phan tu:");
    int n= sc.nextInt();
    
    
    ArrayList<LMQ656Person> Std =new ArrayList<>();
    for (int i=0;i<n;i++){
    LMQ656Person Student = new LMQ656Person();
    Student.nhapthongtin();
    Std.add(Student);
    }
    

    for (int i=0;i<n;i++){System.out.print("doi tuong thu"+(i+1) );
    Std.get(i).xuatthongtin();
        
    }
}
}