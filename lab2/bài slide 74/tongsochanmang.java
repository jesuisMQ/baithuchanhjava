
   import java.util.Scanner;
    public class tongsochanmang {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0;
        System.out.println("nhap so phan tu cua mang:");
        n = sc.nextInt();
        int a[]=new int [n];
        for(int i=0; i<=n-1; i++){
        System.out.print("Nhap phan tu a["+(i+1)+"]:");
        a[i]= sc.nextInt();
        }
        
        for(int i=0; i<=n-1; i++){
            if(a[i]%2==0){
            tong+=a[i];
            }

        }
        System.out.println("tong cac so chan cua mang la:"+tong);
        }
    }