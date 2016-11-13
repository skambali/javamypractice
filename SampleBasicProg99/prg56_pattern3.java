package SampleBasicProg99;

public class prg56_pattern3 {
	public static void main(String []args)
	{
		System.out.println("PATTERN");
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("*\t");
			}
			System.out.println(" ");	
		}
		
	}

}
