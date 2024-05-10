import java.util.Scanner;
public class xacdinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("nhap so bat ky:");
        a= sc.nextInt();
        if(a % 2 == 1){
            System.out.println("vay"+a +"la so le");
        }
        else{
            System.out.println(a +"la so chan");
        }
        }
        
    }

