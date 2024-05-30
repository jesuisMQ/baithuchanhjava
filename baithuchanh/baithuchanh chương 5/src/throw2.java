import java.io.IOException;
public class throw2 {

    void m() throws IOException{
        throw new IOException ("loi thiet bi");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("ngoai le duoc xu ly");
        }
    }
    public static void main(String[] args) {
        throw2 sl15 = new throw2();
        sl15.p();
        System.out.println("luong binh thuong.......");
    }
}

