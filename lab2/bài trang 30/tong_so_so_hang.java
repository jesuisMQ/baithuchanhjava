import java.util.Scanner;
class tong_so_so_hang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,sum=0;
        System.out.println("Nhap so nguyen duong bat ky:");
        a=sc.nextInt();
        while(a>0){
        
           sum +=  a%10;
           a=a/10;
        }
        System.out.println("Tong so so hang là:"+sum);
        
       
    }
     }
