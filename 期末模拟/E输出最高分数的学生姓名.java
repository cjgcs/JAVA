package 期末测试;

import java.util.Scanner;

public class E输出最高分数的学生姓名 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int a,max1=0,x=0;
		String b,max=null;
		for(int i=0;i<n;i++) {
			a=kb.nextInt();
			b=kb.next();
			if(a>max1) {
				max1=a;
				max=b;
			}
		}
		System.out.println(max);
	}
}

输入学生的人数，然后再输入每位学生的分数和姓名，求获得最高分数的学生的姓名。


输入
第一行输入一个正整数 N(N≤100)，表示学生人数。接着输入 N 行，每行格式如下： 

分数 姓名  
分数是一个非负整数，且小于等于100；

姓名为一个连续的字符串，中间没有空格，长度不超过20。  

数据保证最高分只有一位同学。  

输出
获得最高分数同学的姓名。
