import java.util.Scanner;
import java.util.ArrayList;
public class LMQ656Person {
    public int age;
    public String name;
   public double luong;
   Scanner sc =new Scanner(System.in);
  public void nhapthongtin(){
    System.out.print("ten la");
    name=sc.nextLine();
    System.out.print("tuoi la:");
    age= sc.nextInt();
    System.out.print("co luong la:");
    luong=sc.nextDouble();
   }
  public void xuatthongtin(){
    System.out.println("ten la:"+name);
    System.out.println("tuoi la:"+age);
    System.out.println("co luong la:"+luong);
   }
  
   ArrayList<LMQ656Person> arrayList;
   public void themphantu(int n){
      arrayList =new ArrayList<>(n);
    for(int i=0; i<n; i++){
   LMQ656Person st1 = new LMQ656Person();
   System.out.print("nhap phan tu thu"+(i+1));
    st1.nhapthongtin();
    arrayList.add(st1);
  }
  }
   String inputString ="le minh quan";
   
   public void suaphantu(){
   int size = arrayList.size();
    for(int i=0;i<size;i++){
      if( arrayList.get(i).name.equals(inputString)){
      LMQ656Person st2 = new LMQ656Person();
      st2.nhapthongtin();
     arrayList.set(i,st2);
      }
    }
  }
  String ipString ="nguyen van a";
      public void xoaphantu(){
        for(int i=0;i<arrayList.size();i++){
        if( arrayList.get(i).name.equals(ipString)){
        arrayList.remove(i);
      }

    }
   }
   public void xuatphantucuaarraylist(){
    int size = arrayList.size();
    for(int i=0;i<size;i++){
      LMQ656Person st3 = new LMQ656Person();
      st3=arrayList.get(i);
      System.out.print("gia tri cua phan tu thu "+ (i+1) +"la:");
      st3.xuatthongtin();
      
    }
   }

   
    }



