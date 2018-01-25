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
public class NewClass {
    public static void main(String[] args){
        String name;
        name=("Pabitra");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        int len;
        len=name.length();
        System.out.println("name:"+name);
        System.out.println("length is:"+len);
    }
}