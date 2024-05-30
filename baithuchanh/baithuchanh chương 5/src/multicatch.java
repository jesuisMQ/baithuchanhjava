import java.util.Scanner;
public class multicatch {
    public static void main(String[] args) {
        try{Scanner sc = new Scanner(System.in);
            System.out.println("nhap so phan tu cua mang:");
            int n = sc.nextInt();
            int [] a = new int[n];
            a[5]=30/0;
            
            
        }catch( ArithmeticException e){
            System.out.println("nhiem vu 1 completed");
        }
        catch( ArrayIndexOutOfBoundsException e){
            System.out.println("nhiem vu 2 completed");
        }
        catch( Exception e){
            System.out.println("nhap sai kieu du lieu");
        }
        
    }
}
