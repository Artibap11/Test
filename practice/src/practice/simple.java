/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class simple {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        num= sc.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
            else {
                    System.out.println("odd number"); 
                    }
           
        }
    }
    

