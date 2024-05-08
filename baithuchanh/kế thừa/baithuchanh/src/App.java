public class App {
    public static void main(String[] args) throws Exception {
        HinhTron ht1 = new HinhTron();
        HinhTron ht2 =new HinhTron();
        HinhTron ht3 =new HinhTron();
        System.out.println("nhap vao thong so ht1:");
        ht1.nhapbankinh();
        ht1.tinhchuvi();
        ht1.inchuvi();
        System.out.println("nhap vao thong so ht2:");
        ht2.nhapbankinh();
        ht2.tinhdientich();
        ht2.indientich();
        System.out.println("nhap vao thong so ht3:");
        ht3.nhapbankinh();
        ht3.tinhchuvi();
        ht3.inchuvi();
        ht3.tinhdientich();
        ht3.indientich();

     
    }
}
