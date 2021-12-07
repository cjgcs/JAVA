package 类的继承;

abstract class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public abstract void speak();
}
class Cat extends Animal{
	public String skill;
	public Cat() {
		super("Cat~~~");
	}
	@Override
	public void speak() {
		System.out.println("​Meow~~");
	}
}
 interface Flying{
	public void fly();
}
class Eagle extends Animal implements Flying{
	@Override
	public void speak() {
		System.out.println("Wow~~");
	}
	public Eagle() {
		super("Eagle ");
	}
	@Override
	public void fly() {
		System.out.println(getName()+"- spread wings flying flying flying ");
	}
}
 class Airplane implements Flying{
	@Override
	public void fly() {
		System.out.println("Aircraft - powerful ​flying flying flying​");
	}
}

public class D抽象类与接口 {

	public static void main(String[] args) {
		Eagle eagle=new Eagle();
		eagle.fly();
		eagle.speak();
		
		Cat cat=new Cat();
		cat.speak();
		
		Airplane airplane=new Airplane();
		airplane.fly();

	}

}
