package testing;

public class CheckThrow {
	void checkAge(int age){  
		if(age<18)  
		   throw new ArithmeticException("Not Eligible for voting");  
		else  
		   System.out.println("Eligible for voting");  
	   }                                   	
	   public static void main(String args[]){  
		   CheckThrow obj = new CheckThrow();
		   obj.checkAge(13);  
			System.out.println("End Of Program");  
		   }  
}
