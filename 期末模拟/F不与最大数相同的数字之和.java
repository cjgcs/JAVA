package 期末测试;

import java.util.Scanner;

public class F不与最大数相同的数字之和 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int max=0,sum=0,x=0,y=0;
		int a[];
		a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=kb.nextInt();	
		}
		for(int j=0;j<n;j++){
			if(a[j]>max){
				max=a[j];
			}
			
			sum+=a[j];
		}
		for(int j=0;j<n;j++){
			if(a[j]==max){
				y++;
			}
		}
		
		x=sum-(max*y);
		System.out.print(x);
	}
}
