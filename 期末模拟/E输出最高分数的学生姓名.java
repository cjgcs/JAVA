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
