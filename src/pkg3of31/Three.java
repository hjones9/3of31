/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3of31;

import java.util.Scanner;

/**
 *
 * @author HAILEY.JONES
 */
public class Three {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a whole number");
        int y= reader.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.println(i);
        }
        
        
        
    }
    
}
