package testing;


//that is method hiding  not method overloading if usr static 


class A{

	static void get()
	{
		System.out.println("hello");
	}
	 static void getsec(){
		System.out.println("second");
	}
	static void getthird1()
	{
		System.out.println("third");
	}
}
public class Inharitance extends A{

	static void get()
	{
		System.out.println("hello child ");
	}
	static void getsec(){
		System.out.println("second child ");
	}
	static	 void getthird2()
	{
		System.out.println("third child");
	}


	public static void main(String[] args) {
		A ob1=new Inharitance();
		ob1.get();
		ob1.getsec();
		ob1.getthird1();
		//ob1.getthird2();
		//B ob2 = new A();
	}
}