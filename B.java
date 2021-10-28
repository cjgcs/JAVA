package 方法;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n;
		n=kb.nextInt();
		boolean b;
		if(n==0 || n==1)		//如果输入数值等于0或者1则输出空
			System.out.println();
		for(int i=2;i<=n;i++) {		//从2开始循环		
			b=true;					//布尔值为true
			for(int j=2;j<i;j++) {	//循环
				if(i%j==0) {		//判断是否有余数
					b=false;		//改变布尔值状态
					break;
				}
			}
			if(b) {					//如果布尔值为真则输出
				System.out.println(i);
			}
		}
	}

}
