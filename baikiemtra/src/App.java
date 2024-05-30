import java.util.Scanner;
public class App extends LMQ656Person{
    public static void main(String[] args) throws Exception {
        System.out.print("nhap so phan tu cua arraylist:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        LMQ656Person st = new LMQ656Person();
        st.themphantu(n);
        st.xuatphantucuaarraylist();
        st.suaphantu();
        st.xoaphantu();
        st.xuatphantucuaarraylist();
}
}