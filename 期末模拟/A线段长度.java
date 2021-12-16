package 期末测试;
import java.util.Scanner;

public class A线段长度 {

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
