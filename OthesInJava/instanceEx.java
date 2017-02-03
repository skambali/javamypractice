package OthesInJava;

public class instanceEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Thread t=new Thread();
		  
//instanceOf If we know the type at the begining
		//System.out.println( t instanceof Thread);
		
		//IsInstance- if we dont know the type at the begining
		System.out.println(Class.forName(args[0]).isInstance(t));
	}
}
