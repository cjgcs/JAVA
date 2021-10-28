package 方法;

import java.util.Scanner;


public class D {
	static int digit(int n,int k) {
		for(int i=1;i<k;i++) {	//定义循环
			n/=10;				//每次循环除10（退位）
		}
		return n%10;			//返回取余数值（输出哪个数）
	}


	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a,b;
		a=kb.nextInt();
		b=kb.nextInt();
		System.out.println(digit(a,b));
	}

}
