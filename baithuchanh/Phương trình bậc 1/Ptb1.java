import java.util.Scanner;

public class Ptb1
{
 public static void main(String[] args)
 {
    double a,b,x;
    Scanner scanner= new Scanner(System.in);
    System.out.print("a =");
    a = scanner.nextDouble();
    System.out.print("b =");
    b = scanner.nextDouble();
    if (a==0){
        System.out.print("Khong phai phuong trinh bac 1 ");
     }
       
    else {
        x = -b/a;
        System.out.println(" Phương trình có nghiệm là =" + x);
    }
    
 }   
}
