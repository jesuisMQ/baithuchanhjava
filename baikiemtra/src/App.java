import java.util.Scanner;
public class App extends LMQ656Person{
    public static void main(String[] args) throws Exception {
        System.out.print("nhap so phan tu cua arraylist:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        LMQ656Person st = new LMQ656Person();
        LMQ656Student st1= new LMQ656Student();
        st1.nhapthongtin();
        st1.xuatthongtin();
        st.themphantu(n);
        st.xuatphantucuaarraylist();
        st.suaphantu();
        st.xoaphantu();
        st.xuatphantucuaarraylist();
        
}
}