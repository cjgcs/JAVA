package 类的继承;
import java.util.Scanner;

class Person{
	private String userName;
	private String password;
	private String hobby;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password!=null&&!"".equals(password)){
			this.password=password;			
		}
		else this.password="illegal password";
	}
}
public class A定义public方法访问私有成员变量{
	public static void main(String[] args){
		Scanner kb=new Scanner(System.in);
		Person Person=new Person();
		String n=kb.nextLine();
		Person.setPassword(n);
		  System.out.println(Person.getPassword());
		 }
		
	
	
}
