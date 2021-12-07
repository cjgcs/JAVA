package 类的继承;

class Point{
	int x,y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public double ToOrigin() {
		return Math.sqrt(x*x+y*y);
	}
}
class myPoint extends Point{
	String name;
	myPoint(int x,int y,String name){
		super(x,y);
		this.name=name;
	}
	public String toString() {
		return name+"( " +x+" , "+y+" )";
	}
}

public class E到原点的距离 {

	public static void main(String[] args) {
		myPoint A=new myPoint( 3 , 4 ,"Q");
		System.out.printf("The distance from %s to the origin is %.2f ",A.toString(  ),A.ToOrigin( ));
	}

}
