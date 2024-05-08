import java.util.Scanner;
public class hinhtron extends hinhhoc {
    public float banKinh;
    public hinhtron(){
        ten="hinh tron";
    }
    public void nhapBanKinh(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ban kinh:");
        banKinh = sc.nextInt();
    }
    public void tinhChuVi(){
        chuVi= 2 *pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich= pi*banKinh*banKinh;
    }
 

}
