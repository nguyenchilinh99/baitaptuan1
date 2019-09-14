package lap3bai1;

import java.util.Scanner;


public class Lap3bai1 {
    public static void main(String[] args) {
        
        int a;
        boolean kiemTra=true;
        Scanner chiLinh = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên :");
        a= chiLinh.nextInt();
        for(int i=2 ;i<a-1;i++ ){
            if (a % i == 0) {
                kiemTra=false; break;
            }
    }
        if (kiemTra==false) {
            System.out.println("Số bạn vừa nhập không phải là số nguyên tố !");
        } else System.out.println("Số bạn vừa nhập là số nguyên tố !"); {
        }
    
}
}