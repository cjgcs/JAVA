package ÆÚÖĞ¿¼ÊÔ;

import java.util.Scanner;


public class C {
 
 
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        double a,c;
        a=kb.nextInt();
        if(a<=150){
            c=a*0.4463;
        }else
        if(a<=400){
            c=150*0.4463+(a-150)*0.4663;
        }else{
            c=(400-150)*0.4663+150*0.4463+(a-400)*0.5663;
        }
 
        System.out.printf("%.1f",c);
    }
 
}