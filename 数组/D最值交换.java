package ����;
//����һ��������n��������n������������Сֵ���һ�������������ֵ�����һ����������Ȼ������������n������
import java.util.Scanner;

public class D��ֵ���� {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		 int n=kb.nextInt();
		 int[] a=new int[n];
		 int max,min,j = 0,c,d;
		 max=min=0;
		 for(int i=0;i<a.length;i++) {
				a[i]=kb.nextInt();
					
			}
		    for(int i=0;i<a.length;i++)//�ҳ��������Сֵ����λ��
		    {
		        if(a[min]>a[i])
		            min=i;
		    }
		    int b=a[0];
		    a[0]=a[min];
		    a[min]=b;        //����b���ڽ���
		    
		    for(int i=0;i<n;i++) 
		    {
		        if(a[max]<a[i])
		            max=i;
		    }
		    b=a[max];
		    a[max]=a[n-1];
		    a[n-1]=b;
		     
		    for(int i=0;i<a.length;i++)
		       System.out.printf("%d  ",a[i]);
	}
}
