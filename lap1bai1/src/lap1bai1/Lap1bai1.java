/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap1bai1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lap1bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hoTen;
        Scanner chiLinh =new Scanner(System.in);
        
        System.out.println("Nhap Ho Va Ten:");
        hoTen = chiLinh.nextLine();
        
        System.out.println("Nhap Diem TB");
        double diemTB= chiLinh.nextDouble();
        System.out.println("ten Da Nhap La"+hoTen+"diem Tung Binh la"+diemTB);
        
        
        // TODO code application logic here
    }
    
}
