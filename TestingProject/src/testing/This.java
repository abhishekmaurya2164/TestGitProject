package testing;

public class This {
	This(){
		this(10);
		System.out.println("this is no argument constructore");
	}
	This(int a){
		System.out.println("this ths parameteraies constructore");
	}
	public static void main(String[] args) {
		new This();
		System.out.println("this is main body");
	}
}