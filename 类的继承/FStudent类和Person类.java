package ÀàµÄ¼Ì³Ð;

 class Persons{
	protected String name;
	protected char sex;
    Persons(String name,char sex){
	this.name=name;
	this.sex=sex;
	}
	
	String name(){return name;}
	char sex(){return sex;}
	public String toString(){
	String s=new String(name+"(sex : "+ sex+ ")");
	return s;
    }
}
 class Students extends Persons{
	 protected String id;
	 Students(String name,char sex){
		 super(name,sex);
	 }

	 
	 Students(String name,char sex,String id){
		 super(name,sex);
		 this.id=id;
	 }
	 public String toString() {
		 String s=new String(name+"(sex : "+ sex);
		 if(id!=null &&!"".equals(id)){s+=" ; "+"id : "+id;}   //判断id输入是否为空
		 s+=")";
		 return s;
	 }
	  public  void adc(String id){
		 this.id=id;
	 }
	
 }
  
public class FStudent类和Person类{
	public static void main(String[] args) {
		Persons frank=new Persons("Frank " , 'M');
		Students alice=new Students("Alice ",'F');
		System.out.println("frank:"+frank);
		System.out.println("alice: "+alice);
		Persons tom=alice;
		System.out.println("tom: "+tom);
		alice.adc("0000001");
		System.out.println("tom: "+tom);
	}

}
