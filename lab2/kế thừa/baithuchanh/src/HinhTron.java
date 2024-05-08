import java.util.Scanner;
public class HinhTron {
    public float r;
    public float chuvi;
    public float dientich;
    public final float pi=3.14f;
    public void nhapbankinh(){
        System.out.println("Nhap vao ban kinh hinh tron:");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2*pi*r;
    }
    public void tinhdientich(){
        dientich=pi*r*r;
    }
    public void inchuvi(){
    System.out.println("dien tich ="+chuvi);
   
    }
    public void indientich(){
    System.out.println("Chu vi ="+dientich);
   
    }
}
