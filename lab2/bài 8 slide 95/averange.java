import java.util.Scanner;
public class averange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong=0;
        double avg;
        System.out.print("Nhap so luong so:");
        n= sc.nextInt();
        int a[] = new int [n];
    for(int i=0; i<n; i++){
            System.out.println("Nhap so thu"+(i+1)+"=");
            a[i]=sc.nextInt();
            tong+=a[i];
        }
        avg=(double)tong/n;
        System.out.print("vay average cua day vua nhap la: %.3f",avg);
    }
}
