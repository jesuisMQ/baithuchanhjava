import java.util.Scanner;
public class LMQ656Student extends LMQ656Person {
    public String gender;

Scanner sc = new Scanner(System.in);
@Override
public void nhapthongtin(){
   
   super.nhapthongtin();
   System.out.println("nhap gioi tinh:");
    gender= sc.nextLine();
}
@Override
public void xuatthongtin(){
      super.xuatthongtin();
      System.out.println("gioi tinh la:"+gender);

    }
 
}
