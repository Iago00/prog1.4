/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1.pkg4;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float suma, resta, producto, cociente, op1 = 0, op2 = 0;
        Scanner ss;
        ss=new Scanner(System.in);
        op1=ss.nextFloat();
        op2=ss.nextFloat();
        System.out.println("suma = " +(op1+op2)+ "resta = " +(op1-op2)+ "cociente = " +(op1*op2) +"cociente = " +(op1/op2));
        
        
        
    }
    
}
