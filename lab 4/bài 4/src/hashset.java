import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        String tenhoaqua;
        Scanner sc = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<String>();
        System.out.print("nhap vao so phan tu cua hashSet: ");
        int n =sc.nextInt();
        System.out.print("nhap vao tên các loại quả: ");
        for (int i = 0;i < n; i++) {
            System.out.print("Nhập tên quả thứ " + (i + 1));
            tenhoaqua = sc.nextLine();
            hashSet.add(tenhoaqua);
        }
        System.out.print("so phan tu cua hashSet = " + hashSet.size());
        System.out.print("Nhập tên loại quả cần tìm: ");
        String search = sc.nextLine();
        if (hashSet.contains(search)) {
            System.out.print("Có" + search + " trong hashSet!");
        } else {
            System.out.print("Không tìm thấy " + search);
        }
        System.out.print("nhap vao tên loại quả cần xóa:");
        String removehoaqua = sc.nextLine();
        if (hashSet.contains(removehoaqua)) {
            hashSet.remove(search);
            System.out.print("deletecomplete");
            System.out.print("hoa quả còn lại trong hashSet:" + hashSet);
        } else {
            System.out.print("Xóa không thành công!");
        }
        ArrayList<String> listhoaqua = new ArrayList<>();
        listhoaqua.add("nho");
        listhoaqua.add("cam");
        hashSet.addAll(listhoaqua);
        System.out.print("hoa quả có trong hashSet sau khi thêm:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        hashSet.removeAll(listhoaqua);
        System.out.print("hoa quả có trong hashSet sau khi xóa:" + hashSet);
    }
}
