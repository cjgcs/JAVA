package ÆÚÖÐ¿¼ÊÔ;

import java.util.Scanner;


public class B {
 
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n,x,y;
        n=kb.nextInt();
        x=kb.nextInt();
        y=kb.nextInt();
        if(x>y){
            System.out.print(y);
             
        }else{
            System.out.print(x);
         
        }
            System.out.print(" ");
        if(x+y>n){
            System.out.println(x+y-n);
        }
        else{
            System.out.println(0);
        }
    }
}