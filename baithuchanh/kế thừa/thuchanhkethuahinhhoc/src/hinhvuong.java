import java.util.Scanner;
public class hinhvuong extends hinhchunhat {
    public hinhvuong(){
        ten="hinh vuong";
    }
    public void nhapCanh(){
        System.out.println("Nhap canh:");
        Scanner sc =new Scanner(System.in);
        dai=rong= sc.nextInt();
    }
}
