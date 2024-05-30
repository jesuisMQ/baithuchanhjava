import java.util.LinkedList;
import java.util.Scanner;
import java.util.ListIterator;
public class linkedlist{
    public static void main(String[] args) {
    String ten, mangsv[];   
    float diem;
    LinkedList <String> linkedlist = new LinkedList<>();
    ListIterator <String> listIterator;
    Scanner sc =new Scanner(System.in);
    do {
        System.out.println("nhap vao ten sinh vien");
        ten=sc.nextLine();
    if(!ten.isEmpty()){
        System.out.println("nhap vao diem sinh vien");
        diem=Float.parseFloat(sc.nextLine());
        String thongtin = ten +"            "+diem;
        linkedlist.add(thongtin);
    }
    } while(!ten.isEmpty());   
    LinkedList<String> svthilai = new LinkedList<>();
    mangsv=linkedlist.get(0).split("            ");
    float maxdiem = Float.parseFloat(mangsv[1]);
    for (int i=0; i<linkedlist.size();i++){ 
        String n = linkedlist.get(i);
        mangsv = n.split("          ");
        Float point = Float.parseFloat(mangsv[1]);
        if(point<=5){
            svthilai.add(n);
        }
        if(maxdiem<point){
            maxdiem=point;
        }
    }
    if(svthilai.isEmpty()){
        System.out.println("khong co sinh vien thi lai");
    }
    else{ listIterator = svthilai.listIterator(); 
        System.out.println("so sinh vien thi lai là:"+svthilai.size());
        System.out.println("thong tin sinh vien:");
        
        System.out.println("ten"+"                    "+"diem");
    while(listIterator.hasNext()){
       
        System.out.println(listIterator.next());
    }
    }
    LinkedList<String> svdiemcao = new LinkedList<>();
    for(int i=0;i<linkedlist.size();i++){
        String n= linkedlist.get(i);
        mangsv = n.split("         "); 
        float point = Float.parseFloat(mangsv[1]);
        if(point==maxdiem){
            svdiemcao.add(linkedlist.get(i));
        }
    }
    System.out.println("thong tin sinh vien diem cao:");
    System.out.println("ten"+"                  "+"diem");
    listIterator=svdiemcao.listIterator();
    while(listIterator.hasNext()){
        System.out.println(listIterator.next());
    
    }
    LinkedList<String> svcantim= new LinkedList<>();
    System.out.println("nhap ten muon tìm kiem:");
    String timkiem = sc.nextLine();
    for(int i=0;i<linkedlist.size();i++){
        String n= linkedlist.get(i);
        mangsv= n.split("           ");
        String name = mangsv[0];
        if(name.equals(timkiem)){
            svcantim.add(linkedlist.get(i));
        }
    }
    System.out.println("ten"+"                      "+"diem");
    listIterator = svcantim.listIterator();
    while(listIterator.hasNext()){
        System.out.println(listIterator.next());
    }
}  
}