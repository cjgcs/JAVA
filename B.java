package ����;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n;
		n=kb.nextInt();
		boolean b;
		if(n==0 || n==1)		//���������ֵ����0����1�������
			System.out.println();
		for(int i=2;i<=n;i++) {		//��2��ʼѭ��		
			b=true;					//����ֵΪtrue
			for(int j=2;j<i;j++) {	//ѭ��
				if(i%j==0) {		//�ж��Ƿ�������
					b=false;		//�ı䲼��ֵ״̬
					break;
				}
			}
			if(b) {					//�������ֵΪ�������
				System.out.println(i);
			}
		}
	}

}
