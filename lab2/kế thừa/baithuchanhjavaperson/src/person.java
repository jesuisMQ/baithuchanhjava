import java.util.Scanner;
public class person{
 public String fullname;
 public String gioitinh;
 public String cung;
 public int namsinh;
 public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("nhap ten cua ban:");
    fullname = sc.nextLine();
    System.out.println("nhap gioi tinh cua ban");
    gioitinh=sc.nextLine();
    System.out.println("Nhap cung cua ban:");
    cung=sc.nextLine();
    System.out.println("Nhap nam sinh:");
    namsinh= sc.nextInt();
    
 }
public void inthongtin(){
    System.out.println("Ten:"+ fullname);
    System.out.println("gioitinh:"+gioitinh);
    System.out.println("cung:"+cung);
}
public person(){
    fullname="minh quan";
    gioitinh="nam";
    cung="thien binh";
}
public void tinhtuoi(){
    int tuoi= 2024-namsinh;
    System.out.println("tuoi nam nay la:"+tuoi);
}
public void tinhtuoi(int x){

    int tuoi=2024-x;
    System.out.println("tuoi nam nay la:"+tuoi);
}
}

 