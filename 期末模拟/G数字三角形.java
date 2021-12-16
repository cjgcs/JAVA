package ÆÚÄ©²âÊÔ;

import java.util.Scanner;

public class GÊý×ÖÈý½ÇÐÎ {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			   for(int f=0;f<i;f++) {
			    if(m>=10) {
			     System.out.printf("%4d",m);
			    }else {
			     System.out.printf("%4d",m);
			    }
			    m+=1;
			   }
			   System.out.println();
			  }
	}
}

打印数字三角形,从1开始输出，第i行输出i个数，每个数字按4个位置输出
注：格式符 %4d可以输出一个数，占据四个位置，右对齐。

输入
输入一行，包含一个整数n

输出
输出n行，第i行，有i个数, 每个数占据四个位置。
