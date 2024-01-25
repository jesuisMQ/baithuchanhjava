import java.util.Scanner;
public class nhomtuoi {
    public static void main(String[] args) {
        
    
    Scanner sc =new Scanner(System.in);
    
    System.out.print("nhap ten:");
    String ten = sc.nextLine();
    System.out.print("nhap nam sinh:");
    int a, namsinh = sc.nextInt();
    a= 2024-namsinh;
    if(a<16){
        System.out.println("ban"+ten+"la tuoi vi thanh nien");
    }
    else if(16<=a && a<18){
        System.out.println("ban"+ten+"la do tuoi truong thanh");
    }
    else if(a>=18) {
        System.out.println("ban"+ten+"da gia");
    }
    }
    }