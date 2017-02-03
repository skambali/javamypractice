package JavaProgram;

public class constructorDemo {
	String name;
	int roll;
	public constructorDemo(String name,int roll) {
		this.name=name;
		this.roll=roll;
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		constructorDemo c=new constructorDemo("Shruthi", 5);
		System.out.println(c.name +"+" +c.roll);
		
		
	}
}
