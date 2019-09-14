/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2lap2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Bai2lap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a,b,c,Delta,x,x1,x2;
        Scanner chiLinh = new Scanner (System.in);
        System.out.println("nhap vao gia tri a cua phuong trinh :");
        a= chiLinh.nextDouble();
        System.out.println("nhap vao gia tri b cua phuong trinh :");
        b= chiLinh.nextDouble();
        System.out.println("nhap vao gia tri c cua phuong trinh :");
        c =chiLinh.nextDouble();
        if (a==0){
            if (b==0){
                if (c==0){
                    System.out.println("phuong trinh co vo so nghiem !");
                }
                else {
                    System.out.println("phuong trinh vo nghiem !");
                }
            }
            else {
                x=-c/a;
                System.out.println("nghiem cua phuong trinh la "+x);
            }
        }
        else {
            Delta =Math.pow(b,2)-4*a*c;
            if (Delta <0){
                System.out.println("phuong trinh vo nghiem !");
            }
            if (Delta == 0){
                x=-b/(2*a);
                System.out.println("phuong trinh co nghiem kep !");
            }
            if (Delta >0){
                double cangDelta=0;
                cangDelta= Math.sqrt(Delta);
                x1=(-b+cangDelta)/(2*a);
                x2=(-b-cangDelta)/(2*a);
                System.out.println("phuong trinh co hai nghiem phan biet la :");
                System.out.println("x1="+x1);
                System.out.println("x2="+2);
                
            
                 
                }
            }
        }
        // TODO code application logic here
    }
    