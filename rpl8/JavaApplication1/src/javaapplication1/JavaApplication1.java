/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner masukan = new Scanner (System.in);
System.out.println("Masukan batas bilangannya :");
int batas = masukan.nextInt();
System.out.println("Bilangan genap dari 2 sampai bil tersebut :");
for (int i=2; i<=batas; i=i+2)
System.out.print(i + " ");
        }
    }
    

