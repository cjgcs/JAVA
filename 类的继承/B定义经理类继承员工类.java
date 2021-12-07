package 类的继承;

import java.util.Scanner;

class Employee{
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
class Manager extends Employee{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
public class B定义经理类继承员工类 {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		String n1,n2;
		double a,b,c;
		n1=kb.next();
		a=kb.nextDouble();
		n2=kb.next();
		b=kb.nextDouble();
		c=kb.nextDouble();
		Employee employee=new Employee();
		employee.setName(n1);
		employee.setSalary(a);
		Manager manager=new Manager();
		manager.setName(n2);
		manager.setSalary(b);
		manager.setBonus(c);
		System.out.println("Employee name:"+employee.getName());
		System.out.println("Employee salary:"+employee.getSalary());
		System.out.println("Manager's name:"+manager.getName());
		System.out.println("Manager's salary:"+manager.getSalary());
		System.out.println("Manager bonus:"+manager.getBonus());
	}

}
