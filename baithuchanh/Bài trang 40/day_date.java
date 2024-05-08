import java.util.Scanner;
class day_date {
public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ngay:");
 
    int ngay=sc.nextInt();
    switch(ngay){
        case 0: 
        System.out.println("Thu hai");
        break;
        case 1: 
        System.out.println("Thu ba");
        break;
        case 2: System.out.println(" Thu tư");
        break;
        case 3: System.out.println("Thu nam");
        break;
        case 4:System.out.println("Thu sau");
        break;
        case 5:System.out.println("Thu bay");
        break;
        case 6:System.out.println("Chu nhat");
        break;
    default:
    System.out.println("ngay sai");
    break;
    }
    
}
}