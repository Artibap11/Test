/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author dell
 */

    class Operation{  
 int data=50;  
  
 void change(int data){  
 data=data+100;//changes will be in the instance variable  
 System.out.println("New value"+data);
 }  
     
    
 public static void main(String args[]){  
   Operation op=new Operation ();  
  
   System.out.println("before change "+op.data);  
   op.change(500);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  
    

