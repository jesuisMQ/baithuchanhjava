import java.util.HashSet;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public class HashAdd {
    public static void main(String[] args) {

        int number;
        HashSet<Integer> hashSetIntegers = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetIntegers.add(0);
        hashSetIntegers.add(3);
        hashSetIntegers.add(1);
        hashSetIntegers.add(4);
        hashSetIntegers.add(2);
        hashSetIntegers.add(8);
        System.out.println(" cac phan tu trong hashSetInteger: ");
        System.out.println(hashSetIntegers);
        System.out.println(" nhap phan tu can them: ");
        number = sc.nextInt();
        if (!hashSetIntegers.contains(number)) {
            System.out.println(" them thanh cong! ");
            System.out.println(hashSetIntegers);
            System.out.println(" cac phan tu trong hashSetInteger sau khi them: ");

        } else {
            System.out.println(" phan tu " + number + "da ton tai! ");
        }
    }
}
