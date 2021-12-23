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

用手机发短信，一条短信资费为0.1元，但限定一条短信的内容在70个字以内（包括70个字）。
如果计算鸭一次所发送的短信超过了70个字，则会按照每70个字一条短信的限制把它分割成多条短信发送。
假设已经知道计算鸭当月所发送的短信的字数，试统计一下计算鸭当月短信的总资费。

输入
第一行是整数n(1≤n≤100)，表示当月发送短信的总次数，
接着 n行每行一个正整数(不超过1000)，表示每次短信的字数。

输出
输出一行，当月短信总资费，单位为元，精确到小数点后1位。
