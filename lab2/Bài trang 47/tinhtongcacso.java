import java.util.Scanner;
class tinhtongcacso{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, sum=0,i=1;
        String str ="";
       
        System.out.println("nhap cac so nguyen");
        while(sum<=100){   
            System.out.print("a"+"["+i+"]"+"=");
            i++;
            a = sc.nextInt();
            sum += a;
            str=str+a+"+";
        }
        str = str.substring(0,(str.length()-1));
        System.out.print(str + "="+sum);
    }
}