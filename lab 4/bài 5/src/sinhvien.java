import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
public class sinhvien {
    public static void main(String[] args) {
    String msv, ho_va_ten, lop,thongtin =null,mangsv[];
    int n;  
    Scanner sc = new Scanner(System.in);
    HashMap <String,String> dsthongtinsv = new HashMap<>();
   System.out.println("nhap so phan tu can luu:");
   n=sc.nextInt();
  for(int i=0;i<n;i ++){
    System.out.println("nhap ho&ten sinh vien cho sv thu"+(i+1));
    ho_va_ten =sc .nextLine();
    System.out.println("nhap msv sinh vien cho sv thu"+(i+1));
    msv= sc.nextLine();
    System.out.println("nhap lop sinh vien cho sv thu"+(i+1));
    lop =sc.nextLine();
    thongtin= ho_va_ten+"   "+ lop;
    dsthongtinsv.put(msv,thongtin);
  }
  HashMap<String,String> dssvcantim = new HashMap<>();
  System.out.println("nhap ten lop can tim kiem:");
  String findclass = sc.nextLine();
  Set<String> keyset = dsthongtinsv.keySet();
for (String key :keyset){
  
    mangsv = dsthongtinsv.get(key).split("   ");
    String nameclass = mangsv[1];
    if(nameclass.equals(findclass)){
        dssvcantim.put(key,dsthongtinsv.get(key));
    }
  }
  Set<Map.Entry<String,String>> setdssvcantim = dssvcantim.entrySet();
    System.out.println("thong tin sinh vien :");
    System.out.println(setdssvcantim);
    System.out.println("nhap msv can tim:");
    String MSV = sc.nextLine();
    for (String key :keyset){
        if(key.equals(MSV)){
            dssvcantim.put(key,dsthongtinsv.get(key));
        }
      }
      Set<Map.Entry<String,String>> settenvalop = dssvcantim.entrySet();
    System.out.println("thong tin sinh vien :");
    System.out.println(settenvalop);
}
}