package ÆÚÖÐ¿¼ÊÔ;

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


计算鸭看到上面写：月用电量在 150 千瓦时及以下部分按每千瓦时0.4463 元执行，月用电量在 151∼400 千瓦时的部分按每千瓦时0.4663 元执行，月用电量在 401千瓦时及以上部分按每千瓦时 0.5663 元执行;计算鸭想自己验证一下，电费通知单上应交电费的数目到底是否正确呢。请编写一个程序，已知用电总计，根据电价规定，计算出应交的电费应该是多少。
