package CarProject;

public class Car extends Engine {
	
	public void drive() {
		
		Engine eng = new Engine();
		
		 int engStatus = start();
		 
		 if(engStatus == 1) {
			 System.out.println("Journey started");
		 }else {
			 System.out.println("Journey failed");
		 }
	}
	
}
