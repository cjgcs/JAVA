package ÆÚÖÐ¿¼ÊÔ;

import java.util.Scanner;

public class D1 {
 
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int m,n,x,t;
        int max1 = 0;
        m=kb.nextInt();
        n=kb.nextInt();
        for(int i=1;i<=n;i++) {
        	x=kb.nextInt();  	
	        if(x<=m/2) {
	        	t=x;
	        }
	        else {
	        	t=m-x;
	        }
	        if(max1<t) {
	        	max1=t;
	        }
        }
        System.out.println(max1);
	}
}