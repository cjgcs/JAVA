package ·½·¨;

import java.util.Scanner;


public class C {
	static int akm(int m,int n){
		double a=0;
		if(m==0) return n+1;
		if(m>0 && n==0) return akm(m-1,1);
		if(m>0 && n>0) return akm(m-1,akm(m,n-1));
		return n;
	}

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int m,n;
		n=kb.nextInt();
		m=kb.nextInt();
		System.out.println(akm(n,m));
	}

}
