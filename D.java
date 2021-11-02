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

计算鸭有一个长度为 n 的非负整数序列，请计算序列的最大跨度值（最大跨度值 = 最大值减去最小值）

一共 22 行，第一行为序列的个数 n(1≤n≤1000)。
第二行为序列的 n个不超过1000的非负整数，整数之间以一个空格分隔。
