package ÆÚÖÐ¿¼ÊÔ;

import java.util.Scanner;

public class D {
 
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n,x;
        int max=0,min=1000;
        n=kb.nextInt();
        for(int i=1;i<=n;i++){
            x=kb.nextInt();
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println(max-min);
    }
 
}