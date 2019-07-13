package inharitance;

public class InharitanceDemo extends B {

	public static void main(String[] args) throws Exception {
		
		B b= new B();
		A a =new B();
		
		b.abc();
		a.abc();

	}

}

class A{

	public A() {
		System.out.println("A class contructor" +this.hashCode());
	}
	public void abc() throws Exception{
		System.out.println("A class Method");
	}
	
	
}
class B extends A{
	B(){
		System.out.println("B class constructor "+ this.hashCode());
	}
	public void abc() throws Exception{
		System.out.println("B class Method");
	}
}
