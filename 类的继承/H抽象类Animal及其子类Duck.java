package 类的继承;

import java.util.Scanner;

interface CanSwim{void swim();}
interface CanFly{void fly();}
abstract class Ans{
	private	String name;
	public Ans(String name){this.name=name;}
	public abstract void Sound();
	public String getName() {return name;}
}
class Duck extends Ans{
	public Duck(String name){super(name);}
	public void Sound(){
			System.out.println(getName()+" is barking");
	}	
	public void fly(){
		System.out.println(getName()+" is flying");
	}
	public void swim(){
		System.out.println(getName()+" is swimming");
	}
}

public class H抽象类Animal及其子类Duck {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		Duck aDuck=new Duck(s);
		aDuck.Sound();
		aDuck.fly();
		aDuck.swim();
		kb.close();
	}

}
