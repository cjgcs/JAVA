package ����;

import java.util.Scanner;


public class D {
	static int digit(int n,int k) {
		for(int i=1;i<k;i++) {	//����ѭ��
			n/=10;				//ÿ��ѭ����10����λ��
		}
		return n%10;			//����ȡ����ֵ������ĸ�����
	}


	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a,b;
		a=kb.nextInt();
		b=kb.nextInt();
		System.out.println(digit(a,b));
	}

}
