package 数组;
//输入一个正整数n，再输入n个整数，将最小值与第一个数交换，最大值与最后一个数交换，然后输出交换后的n个数。
import java.util.Scanner;

public class D最值交换 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		 int n=kb.nextInt();
		 int[] a=new int[n];
		 int max,min,j = 0,c,d;
		 max=min=0;
		 for(int i=0;i<a.length;i++) {
				a[i]=kb.nextInt();
					
			}
		    for(int i=0;i<a.length;i++)//找出最大与最小值所在位置
		    {
		        if(a[min]>a[i])
		            min=i;
		    }
		    int b=a[0];
		    a[0]=a[min];
		    a[min]=b;        //数组b用于交换
		    
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
