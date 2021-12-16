package ÆÚÄ©²âÊÔ;

import java.util.Scanner;

public class C¶ÌÐÅ¼Æ·Ñ {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n,m;
		double x=0;
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			m=kb.nextInt();
			if(m>70) {
				if(m%70==0){
					x+=(m/70)*0.1;
				}else {
					x+=0.1+(m/70)*0.1;
				}
			}else {
				x+=0.1;
			}
		}
		System.out.printf("%.1f",x);
	}

}

在一次运动会上，dd联盟的运动员参与了n天的决赛项目 (1≤n≤17)。
现在要统计一下dd联盟所获得的金、银、铜牌数目及总奖牌数。

输入
输入n+1行，第1行是dd联盟参与决赛项目的天数n。
其后n行，每行三个用空格分开的不超过30的非负整数，表示dd联盟某一天获得的金、银、铜牌数目。

输出
输出 1 行，包括 4个整数，为dd联盟所获得的金、银、铜牌总数及总奖牌数，以一个空格分开。
