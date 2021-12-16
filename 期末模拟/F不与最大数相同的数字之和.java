package 期末测试;

import java.util.Scanner;

public class F不与最大数相同的数字之和 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int max=0,sum=0,x=0,y=0;
		int a[];
		a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();	
		}
		for(int j=0;j<n;j++){
			if(a[j]>max){
				max=a[j];
			}
			
			sum+=a[j];
		}
		for(int j=0;j<n;j++){
			if(a[j]==max){
				y++;
			}
		}
		
		x=sum-(max*y);
		System.out.print(x);
	}
}

输出一个整数数列中不与最大数相同的数字之和。

输入
输入分为两行：  
第一行为 N(N 为接下来数的个数，N≤100)；
  
第二行为 N 个整数，数与数之间以一个空格分开，每个整数的范围是 -1,000,000 到 1,000,000。


输出
输出为 N 个数中除去最大数其余数字之和。
