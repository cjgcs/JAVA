package 类的继承;

import java.util.Scanner;

abstract class Shape{
	public abstract double area();
	public abstract double circumference();
}
class Circle extends Shape{
	protected double r;
	public Circle(double r) {
		this.r=r;
	}
	public double getRadius() {
		return r;
	}
	@Override
	public double area(){
		return Math.PI*r*r;
	}
	@Override
	public double circumference(){
		return 2*Math.PI*r;
	}
}

class Rectangle extends Shape{
	protected double w,h;
	public Rectangle(double w,double h) {
		this.w=w;
		this.h=h;
	}
	public double getHeight() {
		return h;
	}
	@Override
	public double area(){
		return w*h;
	}
	@Override
	public double circumference(){
		return 2*(w+h);
	}
}
public class C定义抽象类 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a,b1,b2,c1,c2;
		a=kb.nextInt();
		b1=kb.nextInt();
		b2=kb.nextInt();
		c1=kb.nextInt();
		c2=kb.nextInt();
		Shape[] shapes=new Shape[3];
		shapes[0]=new Circle(a);
		shapes[1]=new Rectangle(b1,b2);
		shapes[2]=new Rectangle(c1,c2);
		double total_area=0;
		for(int i=0;i<shapes.length;i++) {
			total_area=total_area+shapes[i].area();
			System.out.println(total_area);
		}
	}

}
