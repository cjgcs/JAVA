package 类的继承;

import java.util.Scanner;

abstract class An{
	private	String name;
	public An(String name){this.name=name;}
	public abstract void Sound();
	public String getName() {return name;}
}
class Dog extends An{
	public Dog(String name){super(name);}
	public void Sound(){
			System.out.println(getName()+" is barking");
	}	
}
public class G抽象类Animal及其子类Dog{
	public static void main (String[] args){
		Scanner kb=new Scanner(System.in);
		String s=kb.nextLine();
		Dog aDog=new Dog(s);
		aDog.Sound();
		kb.close();
	}
}
