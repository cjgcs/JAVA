package ÆÚÄ©²âÊÔ;
import java.util.Scanner;

public class AÏß¶Î³¤¶È {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		double x1,x2,y1,y2,sum=0;
		x1=kb.nextDouble();
		y1=kb.nextDouble();
	
		x2=kb.nextDouble();
		y2=kb.nextDouble();
		sum=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.printf("%.3f",sum);
	}

}
已知线段的两个端点的坐标 A(x1,y1),B(x2,y2)，求线段AB的长度。
计算鸭告诉了你计算公式如下： Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))

输入
第一行是两个实数x1,y1,即A的坐标。
第二行是两个实数 x2,y2，即B的坐标。
输入中所有实数的绝对值均不超过10000。

输出
一个实数，即线段AB的长度，保留到小数点后3位。
