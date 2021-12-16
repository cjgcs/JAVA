package 期末测试;

import java.util.Scanner;

public class C短信计费 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n,m;
		double x=0;
		n=kb.nextInt();
		for(int i=0;i<n;i++) {
			m=kb.nextInt();
			if(m>70) {
				if(m%70==0){
					x+=(m/70)*0.1;
				}else {
					x+=0.1+(m/70)*0.1;
				}
			}else {
				x+=0.1;
			}
		}
		System.out.printf("%.1f",x);
	}

}
