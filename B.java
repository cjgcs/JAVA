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

曾经有课树叫高树,树上挂了很多人.cjg对班级里面的挂科情况做了调查．班里有n个同学.cjg问了每个同学两个问题
1.你挂高树了吗.
2.你挂爪哇了吗．
同学可能会回答yes,也可能回答no．根据调查cjg知道了班里面有x个同学挂了高树,y个同学挂了爪哇(cjg记性差只记得这些)
cjg想知道同时挂高树和爪哇的最大可能人数max和最小可能人数min


输入一行n,x,y三个整数.代表n个同学,x个人挂了高树,y个人挂了爪哇
1<=n<=100
0<=x<=n
0<=y<=n
