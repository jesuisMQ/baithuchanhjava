import java.util.Scanner;
public class LMQ656Person {
    int age;
    String name;
   double luong;
   Scanner sc =new Scanner(System.in);
   void nhapthongtin(){
    System.out.println("tuoi la:");
    age= sc.nextInt();
    System.out.println("ten la");
    name=sc.nextLine();
    System.out.println("co luong la:");
    luong=sc.nextDouble();
   }
   void xuatthongtin(){
    System.out.println("ten la:"+name);
    System.out.println("tuoi la:"+age);
    System.out.println("co luong la:"+luong);
   }
   public static void main(String[] args) {
    LMQ656Person d1 =new LMQ656Person();
    d1.nhapthongtin();
    d1.xuatthongtin();
   }
}
