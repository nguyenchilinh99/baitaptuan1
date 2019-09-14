package bai4lap2;

import java.util.Scanner;


public class Bai4lap2 {
    public static void bac1() {
        double a,b,x;
        Scanner chiLinh =new Scanner(System.in);
        System.out.println("Nhập giá trị a của phương trình bậc nhất: ");
        a= chiLinh.nextDouble();
        System.out.println("Nhập giá trị b của phương trình bậc hai: ");
        b= chiLinh.nextDouble();
        
        if (a==0) {
            if (b==0) {
                System.out.println("Phương trình có vô số nghiệm !");
                
            } 
            else {
                System.out.println("Phương trình vô nghiệm !");
            }
            
        } 
        else {
            x=-b/a;
            System.out.println("Nghiệm của phương trình là : "+x);
        }
    }
    
    public static void bac2(){
        double a,b,c,Delta,x,x1,x2;
        Scanner chiLinh =new Scanner(System.in);
        System.out.println("Nhập vào giá trị a của phương trình :");
        a=chiLinh.nextDouble();
        System.out.println("Nhập vào giá trị b của phương trình :");
        b=chiLinh.nextDouble();
        System.out.println("Nhập vào giá trị c của phương trình :");
        c=chiLinh.nextDouble();
        
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phương trình có vô số nghiệm !");
                    
                }
                else {
                    System.out.println("Phương trình vô nghiệm !");
                }
                
            }
            else {
                x=-c/b;
                System.out.println("Nghiệm của phương trình là "+x);
            }
            
        }
        else {
            Delta = Math.pow(b, 2)-4*a*c;
            if (Delta < 0) {
                System.out.println("Phương trình vô nghiệm !");
                
            }
            if (Delta == 0) {
                x=-b/(2*a);
                System.out.println("Phương trình có nghiệm kép !");
            }
            if (Delta > 0) {
                double cangDelta=0;
                cangDelta = Math.sqrt(Delta);
                x1=(-b+cangDelta)/(2*a);
                x2=(-b-cangDelta)/(2*a);
                System.out.println("Phương trình có hai nghiệm phân biệt là :");
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
                }
    }
    public static void dien() {
        double a ,tienDien;
        Scanner chiLinh = new Scanner(System.in); 
        System.out.println("Nhập số điện sử dụng trong tháng :");
        a = chiLinh.nextDouble();
        
        if (a < 50) {
            tienDien = a*1000 ;
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
        } 
        else {
            tienDien = 50*1000+(a-50)*1200;
            System.out.println("Tiền điện phải đóng là :"+tienDien +"đồng");
        }
   }
    public static void main(String[] args) {
        int luaChon;
        System.out.println("+-----------------+");
        System.out.println("MENU \r\n 1.Giải phương trình bậc nhất \r\n 2.Giải phương trình bậc 2 \r\n 3.Tính tiền điện \r\n 4.Kết thúc");
        System.out.println("+-----------------+\r\n");
        Scanner chiLinh=new Scanner(System.in);
        luaChon = chiLinh.nextInt();
        switch(luaChon){
        case 1:bac1(); break;
        case 2:bac2(); break;
        case 3:dien(); break;
        case 4:break;
        default: System.out.println("Bạn đã nhập sai! ahihihi");
        }
    }
}