package L3bai1;

import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
import org.w3c.dom.traversal.NodeFilter;
/**
 *
 * @author ASUS
 */
public class L3bai1 {
    public static void main(String[] args) {
        int n;
        double TbCong, tong=0, diem=0;
        Scanner chiLinh =new Scanner(System.in);
        System.out.println("Nhập số lượng các phần tử của mảng :");
        n=chiLinh.nextInt();
        int []mang =new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhập vào phần tử thứ a["+i+"] :");
            mang[i]=chiLinh.nextInt();
    }
       Arrays.sort(mang);
        System.out.println("Các phần tử của mảng sau khi sắp xếp lại ");
        for(int i=0; i<n; i++){
            System.out.println(+mang[i]+" ");
            
        }
        int min=mang[0];
        for(int i=0; i<n; i++){
            if (mang[i]%3 ==0 ){
                tong=tong+mang[i];
                diem++;
            }
        }
        System.out.println("Tổng các phần tử chia hết cho 3 là: "+tong);
        TbCong=tong/diem;
        System.out.println("Trung bình cộng của các số là :"+TbCong);
        
    }
}