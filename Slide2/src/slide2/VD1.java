
package slide2;
import java.util.Scanner;

public class VD1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++){
            System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        
        int tong = 0;
        System.out.println("Mang: ");
        
        for (int i = 0; i < n; i++){
            System.out.println(a[i]);
            tong += a[i];
        }
        
        System.out.println("");
        
        System.out.println("Tong la " + tong);
    }
}
