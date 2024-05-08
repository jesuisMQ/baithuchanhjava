import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;
    public hinhchunhat(){
    ten="hinh chu nhat";
    }
    public void nhapChieuDai(){
        System.out.println("Nhap chieu dai:");
        Scanner sc = new Scanner(System.in);
        dai = sc.nextInt();
    }
    public void nhapChieuRong(){
        System.out.println("Nhap chieu rong:");
        Scanner sc = new Scanner(System.in);
        rong =sc.nextInt();
    }
    public void tinhChuVi(){
        chuVi= (dai+rong)*2;
    }
    public void tinhDienTich(){
        dienTich= dai*rong;
    }
    
}
