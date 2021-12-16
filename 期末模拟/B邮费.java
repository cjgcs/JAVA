package ÆÚÄ©²âÊÔ;

import java.util.Scanner;

public class BÓÊ·Ñ {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		double a,n=0,x = 0,y=0;
		String b;
		a=kb.nextDouble();
		b=kb.next();
		if(b.equals("y")){
			n=n+5;
			if(a>1000 ){
				y=(a-1000)/500;
				if(y<1)
				x=n+(int)(((a-1000)/500)+1)*4+8;
				else
					x=n+(int)(((a-1000)/500))*4+8;
			}else {
				x=n+8;
			}
		
		}else if(b.equals("n")){
			y=(a-1000)/500;
			if(y<1)
			x=n+(int)(((a-1000)/500)+1)*4+8;
			else
			x=n+(int)(((a-1000)/500))*4+8;
		}else{
			x=n+8;
		}
	
		System.out.printf("%.0f",x);
	}
	}
