package 方法;

import java.util.Scanner;

public class A {
	static int ndigit(int n,int k){
		int count = 0;			//定义计数器
		while(n>0){				//循环	
			int a=n%10;			//对输入的数值取余
			if(a==k){			//如果取余的数值等于输入的幸运数
				count++;		//计数器自加
			}
			n=n/10;				//对输入的数值退位
		}
		return count;			//返回计数器
	}

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int t;
		int max8=0;
		int show=0;
		t=kb.nextInt();
		while(t>0){
			int m=kb.nextInt();
			if(ndigit(m,8)>max8){		//判断计数器是否大于0
				max8=ndigit(m,8);		//赋值给最大的幸运数
				show=m;
			}
			t--;
		}
		if(max8==0){
			System.out.println("NO");
		}else{
			System.out.println(show);
		}
	}

}