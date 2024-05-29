import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Scanner;
public class demolinkedlist {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat tbc = new DecimalFormat();
        LinkedList<Integer> LinkedList1 = new LinkedList<>();
         int n , m , sum = 0 , count = 0;
         float TBC;
         System.out.print("Nhap vao so phan tu cua danh sach :");
         n = sc.nextInt();
        System.out.println("nhap gia tri cua cac phan tu trong danh sach :");
      
        for(int i = 0; i < n ; i++) {
            System.out.print("Nhap vao phan tu thu " + i + " : ");
            m = sc.nextInt();
            LinkedList1.add(m);
        }
        for (int i = 0; i<n; i++){
            if (LinkedList1.get(i) % 2 == 0){
                sum += LinkedList1.get(i);
                count++;
            }
        }
        TBC = (float)sum/count;
        System.out.println("Trung binh cua cac so chan co trong ds = " + tbc.format(TBC));

    }
}