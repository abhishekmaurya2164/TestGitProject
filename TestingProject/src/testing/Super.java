package testing;

public class Super extends P{
	
	 Super()
	{
//		super();  //by default use no-arg construtor use super if not use 
		super(10);
		System.out.println("this is chiled coustrautore");
	}
	
	public static void main(String[] args) {
		new Super();
		System.out.println("this is main method");
	}
}
class P{
	 P(){
		System.out.println("this is parent constructor");
	}
	P(int a){
		System.out.println(" this is argument construtor");
	}
}