import java.util.Scanner;
public class dem {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x,demso=0, demchuthuong=0, demchuhoa=0;
        String str;
        System.out.println("Nhap mot dong bat ky:");
        str=sc.nextLine();
        for(int i=0; i<str.length(); i++){

            int asciiCode= str.charAt(i);
            x=asciiCode;
            if(x<=57 && x>=48){
                demso+=1;
            }
            else if(x<=90&&x>=65){
                demchuhoa+=1;
            }
            else if(x<=122&&x>=97){
                demchuthuong+=1;
            }
        }

        System.out.println("So luong so="+demso);
        System.out.println("So luong chu thuong="+demchuthuong);
        System.out.println("So luong chu hoa="+demchuhoa);
    }
}
