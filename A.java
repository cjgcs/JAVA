package ����;

import java.util.Scanner;

public class A {
	static int ndigit(int n,int k){
		int count = 0;			//���������
		while(n>0){				//ѭ��	
			int a=n%10;			//���������ֵȡ��
			if(a==k){			//���ȡ�����ֵ���������������
				count++;		//�������Լ�
			}
			n=n/10;				//���������ֵ��λ
		}
		return count;			//���ؼ�����
	}

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t;
		int max8=0;
		int show=0;
		t=kb.nextInt();
		while(t>0){
			int m=kb.nextInt();
			if(ndigit(m,8)>max8){		//�жϼ������Ƿ����0
				max8=ndigit(m,8);		//��ֵ������������
				show=m;
			}
			t--;
		}
		if(max8==0){
			System.out.println("NO");
		}else{
			System.out.println(show);
		}
	}

}