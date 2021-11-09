package 数组;
//从键盘输入5个整数，判定这些数据是否为从小到大排列。输出“yes"或”no"

import java.util.Scanner;

public class A判定有序 {
		public static void main(String[] args) {
			Scanner kb=new Scanner(System.in);
			int a[];int b=0;
			a=new int[5];
			for(int i=0;i<a.length;i++) {
				a[i]=kb.nextInt();	
			}
			for(int i=0;i<a.length-1;i++) {
			if(a[i+1]<a[i]) {b=1;}
				
			}
			if(b!=1)
			System.out.print("yes");
			else	
			System.out.print("no");
		}
}