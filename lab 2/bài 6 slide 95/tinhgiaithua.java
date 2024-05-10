import java.util.Scanner;
public class tinhgiaithua {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n,m,giaithua;
    System.out.println("Nhap so muon tinh giai thua:");
    n= sc.nextInt();
    giaithua=n;
    m=n;
    do{
        giaithua*=n-1;
        n--;

    }while(n>2);
    System.out.println("vay"+ m+"!="+giaithua);
    }
    
}
