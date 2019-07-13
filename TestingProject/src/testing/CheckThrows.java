package testing;

public class CheckThrows {
	int division(int a, int b) throws ArithmeticException{  
		int t = a/b;
		return t;
	   }  
	   public static void main(String args[]){  
		   CheckThrows obj = new CheckThrows();
		try{
		   System.out.println(obj.division(15,0));  
		}
		catch(ArithmeticException e){
		   System.out.println("You shouldn't divide number by zero");
		}
	   }  
}
