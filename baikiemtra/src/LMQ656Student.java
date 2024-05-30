import java.util.Scanner;
public class LMQ656Student extends LMQ656Person {
    public String gender;

Scanner sc = new Scanner(System.in);

 public void nhapthongtin(){
   
   super.nhapthongtin();
    gender= sc.nextLine();
 }
}
