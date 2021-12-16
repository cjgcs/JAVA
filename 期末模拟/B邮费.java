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


根据邮件的重量和计算鸭是否选择加急计算邮费。
计算规则：重量在 1000克以内(包括1000 克)，基本费 8 元。
超过 1000克的部分，每500克加收超重费4元，不足500克部分按500克计算；
如果计算鸭选择加急，多收5元


输入
输入一行，包含一个正整数和一个字符，以一个空格分开，分别表示重量（单位为克，不超过 2*105）和是否加急。  
如果字符是y，说明选择加急；如果字符是n，说明不加急。


输出
输出一行，包含一个整数，表示邮费。
