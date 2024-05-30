import java.util.Scanner;
public class max2chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Nhap so dong:");
        m= sc.nextInt();
        System.out.println("Nhap so cot:");
        n=sc.nextInt();
        int a[][]=new int [m][n];
    for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
     System.out.println("Nhap so phan tu thu["+(i+1)+"]"+"["+(j+1)+"]:");
     a[i][j]=sc.nextInt();

    }  
}
    int Max=a[0][0];
    for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
    if(a[i][j]> Max){
        Max=a[i][j];
    }
  }   
    }
System.out.println("Vay max cua mang hai chieu la:"+Max);
}
}