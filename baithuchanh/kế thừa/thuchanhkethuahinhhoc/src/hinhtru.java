import java.util.Scanner;
public class hinhtru extends hinhtron {
    public float chieuCao;
    public hinhtru(){
        ten="hinh tru";
    }
    public void nhapChieuCao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu cao:");
        chieuCao= sc.nextInt();
    }
    public void tinhTheTich(){
        theTich= pi*banKinh*banKinh*chieuCao;

    }
}
