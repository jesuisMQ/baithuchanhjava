import java.util.Scanner;
public class LMQ656Student extends LMQ656Person {
    public String gender;

Scanner sc = new Scanner(System.in);

 public void nhapthongtin(){
   
   nhapthongtin();
    gender= sc.nextLine();
 }
public static void main(String[] args) {
   LMQ656Student dt = new LMQ656Student();
   dt.nhapthongtin();
   dt.xuatthongtin();
}
}