import java.util.Scanner;
public class sapxep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, temp;
        System.out.println("nhap so phan tu cua mang:");
        n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            System.out.println("a["+(i+1)+"]=");
            a[i]=sc.nextInt();
        }
    System.out.println("mang chua sap xep:");
    for(int i=0; i<n; i++){
        System.out.print(a[i]+" ");
        }
    System.out.println("\nMang da sap xep:");
    for( int i=0; i<n-1; i++){
        for(int j=i+1; j<=n-1; j++){
        if(a[i]>a[j]){
            temp= a[i];
            a[i]=a[j];
            a[j]=temp;
           
        }
}

}
for( int i=0; i<n; i++){
System.out.print(a[i]+" ");
}
}
}