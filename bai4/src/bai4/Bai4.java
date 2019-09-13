/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,Delta,x;
        Scanner chiLinh= new Scanner (System.in);
        System.out.println("nhap so a");
        a=chiLinh.nextDouble();
        System.out.println("nhap so b");
        b=chiLinh.nextDouble();
        System.out.println("nhap so c");
        c=chiLinh.nextDouble();
        Delta=Math.pow(b, 2)-4*a*c;
        x=Math.sqrt(Delta);
        System.out.println("Delta"+Delta);
        System.out.println("cang Delta"+x);
        // TODO code application logic here
    }
    
}
