import java.util.Scanner;
public class Ptb2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       float a,b,c;
       System.out.println("nhap he so bac 2:");
       a=scanner.nextFloat();
       System.out.print("nhap he so bac 1:");
       b= scanner.nextFloat();
       System.out.print("nhap he so bac 0:");
       c= scanner.nextFloat();
        
        float delta = b*b-4*a*c;
        float X1,X2;
        if (delta > 0) {
            X1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
        X2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + X1 + " và " + X2);
        } 
        else if (delta == 0) {
            X1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + X1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

        } 
    }
