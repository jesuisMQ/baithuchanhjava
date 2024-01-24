import java.util.Scanner;
class tinhtoan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,sum,minus,multi,dev;
        System.out.print("nhap  gia tri cua a:");
        a= sc.nextFloat();
        System.out.println("nhap gia tri cua b:");
        b= sc.nextFloat();

        sum= a+b;
        System.out.println("tong 2 so la:" + sum);
        minus=a-b;
        System.out.println("hieu 2 so la:" + minus);
        multi=a*b;
        System.out.println("tich 2 so la:" + multi);
        dev=a/b;
        System.out.println("thuong 2 so la:" + dev);
        if(a>b){
            System.out.println("a>b");
        }
        else if(a==b){
                System.out.println("a=b");
        }
        else{
            System.out.println("a<b");
        }
        }

        }


