package testing;

class A1{

	 void get()
	{
		System.out.println("hello");
	}
	  void getsec(){
		System.out.println("second");
	}
	 void getthird1()
	{
		System.out.println("third");
	}
}
public class Inharitance2 extends A1{

	 void get()
	{
		System.out.println("hello child ");
	}
	 void getsec(){
		System.out.println("second child ");
	}
		 void getthird2()
	{
		System.out.println("third child");
	}


	public static void main(String[] args) {
		A1 ob1=new Inharitance2();
		ob1.get();
		ob1.getsec();
		ob1.getthird1();
		//ob1.getthird2();
//		Inharitance2 ob21 = new A(); //error: incompatible types: A cannot be converted to B
		Inharitance2 ob2 = new Inharitance2();
		ob2.getthird1();
	}
}