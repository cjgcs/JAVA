package ��ĩ����;

import java.util.Scanner;

public class E�����߷�����ѧ������ {

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
