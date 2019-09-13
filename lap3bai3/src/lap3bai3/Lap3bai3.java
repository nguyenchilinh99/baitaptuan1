/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3bai3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Lap3bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double canh,theTichLapPhuong;
        Scanner chiLinh =new Scanner(System.in);
        System.out.println("Nhap do dai canh");
        canh=chiLinh.nextDouble();
        theTichLapPhuong=Math.pow(canh,3);
        System.out.println("the Tich Khoi Lap Phuong la "+theTichLapPhuong);
        // TODO code application logic here
    }
    
}
