package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		try {
		System.out.println("Hellow World");
		int i =1/0;
		System.out.println("Completed");
		
		}
		catch(Exception exp){
			
			System.out.println("I am inside the catch");
			exp.printStackTrace();
		}
	finally {
		
		System.out.println("Completed");
		
	}
}
}
