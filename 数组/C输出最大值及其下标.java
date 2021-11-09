package 数组;
//输入一个正整数n(1<n<=10)，再输入n个整数，输出最大值及其下标（设最大值唯一，下标从0开始）。
import java.util.Scanner;

public class C输出最大值及其下标 {

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
