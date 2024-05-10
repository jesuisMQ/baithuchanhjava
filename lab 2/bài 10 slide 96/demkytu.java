import java.util.Scanner;
public class demkytu {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        int dem=0;
        char kytu;
        do{System.out.println("Nhap chuoi duoi 80 ky tu:");
        str=sc.nextLine();
        }while(str.length()>80);
        System.out.println("Nhap ky tu muon tim de dem so luong:");
        kytu=sc.next().charAt(0);
        for(int i=0; i<str.length(); i++){
            
            if(str.charAt(i)==kytu){
                dem+=1;
            }

        }
System.out.println("so lan xuat hien ky tu do la:"+dem);
    }
}