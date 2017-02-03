package JavaProgram;

public enum BeearEnum {
	kfc(100,"kgd"),
	bear(50,"bear"),
	coac(99,"caocj"),
	rum;
int price;
String nameofB;

BeearEnum(int price,String nameofB){
	this.price=price;
	this.nameofB=nameofB;
	
}

BeearEnum(){
	this.price=20;
	
}
public int gerPrice(){
	return price;
}

 public String getNameOfB(){
	 return nameofB;
 }
}
