package ����;
//����һ��������n(1<n<=10)��������n��������������ֵ�����±꣨�����ֵΨһ���±��0��ʼ����
import java.util.Scanner;

public class C������ֵ�����±� {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int index=-1;
		int[] a=new int[n];
		int max=0;
		for(int i=0;i<a.length;i++) {
			a[i]=kb.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
				index=i;
			}
		}
		System.out.print(max+"  ");
		System.out.print(index);
	}

}
