package JavaProgram;


class parentConsturctorObject {
	
	parentConsturctorObject(){
		System.out.println(this.hashCode());
	}
}
class B extends parentConsturctorObject{
	
	B(){
		System.out.println(this.hashCode());
	}
}

