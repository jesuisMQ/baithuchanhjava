import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        do{System.out.println("nhap hai so bat ky:");
        a=sc.nextInt();
        b=sc.nextInt();
    
    }while(a==b);
    if(a>b){
        System.out.println("min="+b);
    }
    else{
        System.out.println("min="+a);
      }
    }
}