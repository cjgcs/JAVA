package ��ĩ����;

import java.util.Scanner;

public class G���������� {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			   for(int f=0;f<i;f++) {
			    if(m>=10) {
			     System.out.printf("%4d",m);
			    }else {
			     System.out.printf("%4d",m);
			    }
			    m+=1;
			   }
			   System.out.println();
			  }
	
	}
}
