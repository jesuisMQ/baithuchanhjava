import java.util.Scanner;

import java.util.TreeSet;
public class Treeset{
public static void main(String[] args) {
    

TreeSet <Integer> treeset = new TreeSet<>();
Scanner sc = new Scanner(System.in);
treeset.add(7);
treeset.add(8);
treeset.add(0);
treeset.add(9);
treeset.add(0);
System.out.println("cac phan tu có trong treeset là:"+treeset);
System.out.println("nhap phan tu can them");
int number = sc.nextInt();
if(!treeset.contains(number)){
    treeset.add(number);
    System.out.println("them thành công");
    System.out.println("treeset sau khi them la:"+treeset);
}
else{
    System.out.println("them không thành công");
}

}
}