package 数组;
//输入一个整数，在数组{9,13,25,34,38,62,69,78,86,97}查找该数。如果存在，则输出该数在数组中的位置，否则输出"not Found"
import java.util.Scanner;

public class B查找数据 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a[]={9,13,25,34,38,62,69,78,86,97};
		int searchnum=kb.nextInt();
		int index,left,mid,right;
		index=-1;
		left=0;
		right=a.length-1;
		while(left<=right) {
			mid=(left+right)/2;
			if(a[mid]==searchnum) {
				index=mid;
				break;
			}
			else if(a[mid]<searchnum) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		if(index==-1)System.out.print("not Found");
		else System.out.print(index);
	}

}
