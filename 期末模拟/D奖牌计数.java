package ĆÚÄŠ˛âĘÔ;

import java.util.Scanner;

public class D˝ąĹĆźĆĘý {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
//		int a[];
//		a=new int[3];
//		int b[];
//		b=new int[3];
//		for(int i=0;i<a.length;i++) {
//			a[i]=kb.nextInt();	
//			
//			System.out.print(a[i]+" ");
//		}
		
		int a,b,c;
		int d=0,e=0,f=0,sum=0;
		
		for(int i=0;i<n;i++) {
			a=kb.nextInt();
			b=kb.nextInt();
			c=kb.nextInt();
			d=d+a;
			e=e+b;
			f=f+c;
			
		}sum=d+e+f;
		System.out.print(d+" ");
		System.out.print(e+" ");
		System.out.print(f+" ");
		System.out.print(sum);
	}
}

在一次运动会上，dd联盟的运动员参与了n天的决赛项目 (1≤n≤17)。
现在要统计一下dd联盟所获得的金、银、铜牌数目及总奖牌数。

输入
输入n+1行，第1行是dd联盟参与决赛项目的天数n。
其后n行，每行三个用空格分开的不超过30的非负整数，表示dd联盟某一天获得的金、银、铜牌数目。

输出
输出 1 行，包括 4个整数，为dd联盟所获得的金、银、铜牌总数及总奖牌数，以一个空格分开。
