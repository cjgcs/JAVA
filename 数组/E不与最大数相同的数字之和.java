import java.util.Scanner;


public class E不与最大数相同的数字之和 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n,max=0,sum=0,x;
		n=kb.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=kb.nextInt();
		}
		for(int j=0;j<a.length;j++){
			if(a[j]>max){
				max=a[j];
			}
			sum+=a[j];
		}
		x=sum-max;
		System.out.println(x);
	}

}
