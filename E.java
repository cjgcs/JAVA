package ÆÚÖÐ¿¼ÊÔ;

import java.util.Scanner;

public class E {
 
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
         
        String c;
        c=kb.next();
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 
}



输入一个字符，用它构造一个三角形金字塔。
