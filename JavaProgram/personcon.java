package JavaProgram;

public class personcon
{
	String name;
	int age;
personcon(String name,int age){
	this.name=name;
	this.age=age;
	}
	
	

}

class student extends personcon{
	
	int rollnum;
  int marks;
	student(String name,int age,int rollnum,int marks){
		super(name,age);
		this.marks=marks;
		
	}
	 
	
	
}