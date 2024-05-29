import java.util.Scanner;
public class exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        try{ int a,b;
            System.out.println("nhap mot so nguyen duong:");
            a = sc.nextInt();
            System.out.println("nhap mot so nguyen duong:");
            b= sc.nextInt();
            System.out.println("vay tong la= "+(a+b));
            System.out.println("phep chia a/b="+(a/b));
        }
        catch(Exception ex){
            System.out.println("nhap sai kieu du lieu");
            System.out.println(ex);

        }
    }
}