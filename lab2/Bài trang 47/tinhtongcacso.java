import java.util.Scanner;
class tinhtongcacso{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, sum=0;
        System.out.println("nhap cac so nguyen");
        while(sum<100){   
            System.out.println("a=");
            a = sc.nextInt();
            sum += a;
        }
    

    }
}