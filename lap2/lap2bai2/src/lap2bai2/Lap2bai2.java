/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2bai2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lap2bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double chieuDai,chieuRong,dienTich,chuVi;
        Scanner chiLinh =new Scanner(System.in);
        System.out.println("Nhap Chieu dai ");
        chieuDai= chiLinh.nextDouble();
        System.out.println("Nhap Chieu Rong");
        chieuRong = chiLinh.nextDouble();
        dienTich= chieuDai*chieuRong;
        chuVi= (chieuDai+chieuRong)*2;
        System.out.println("dien Tich La: "+dienTich);
        System.out.println("chu vi la: "+chuVi);
        
        // TODO code application logic here
    }
    
}
