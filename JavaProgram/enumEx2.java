package JavaProgram;

public class enumEx2 {

	public static void main(String[] args) {
		System.out.println("hi");
		BeearEnum[] b =BeearEnum.values();
		System.out.println(b);
		
		for(BeearEnum b1:b){
			System.out.println(b1);
		}
     System.out.println("------------------");
		System.out.println(BeearEnum.rum);
		System.out.println(BeearEnum.kfc);
		
		 System.out.println("------------------");
	}
}
