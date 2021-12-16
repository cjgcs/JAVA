package ÆÚÄ©²âÊÔ;

import java.util.Scanner;

public class D½±ÅÆ¼ÆÊı {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
//		int a[];
//		a=new int[3];
//		int b[];
//		b=new int[3];
//		for(int i=0;i<a.length;i++) {
//			a[i]=kb.nextInt();	
//			
//			System.out.print(a[i]+" ");
//		}
		
		int a,b,c;
		int d=0,e=0,f=0,sum=0;
		
		for(int i=0;i<n;i++) {
			a=kb.nextInt();
			b=kb.nextInt();
			c=kb.nextInt();
			d=d+a;
			e=e+b;
			f=f+c;
			
		}sum=d+e+f;
		System.out.print(d+" ");
		System.out.print(e+" ");
		System.out.print(f+" ");
		System.out.print(sum);
	}

}
