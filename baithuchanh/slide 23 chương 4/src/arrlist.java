import java.util.ArrayList;
import java.util.Scanner;
public class arrlist{
    public static void main(String[] args) {
        ArrayList<Integer> pt = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.print("nhap vao so phan tu:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int m =sc.nextInt();
            pt.add(m);
        }  
        int max = pt.get(0);
        for(int i=0;i<n;i++){
          
            if(pt.get(i)>max){
                max= pt.get(i);
            }
        }
        System.out.println("vay max la:"+max);
            

            

        }
    }

