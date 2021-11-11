import java.util.Scanner;


public class F与指定数字相同的数的个数 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n,m,x=0;
		n=kb.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=kb.nextInt();
			
		}
		m=kb.nextInt();
		for(int j=0;j<a.length;j++){
			if(a[j]==m){
				x++;
			}
		}
		System.out.print(x);
	}

}
