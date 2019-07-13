package designPattern;

public class Singltone {

	public static void main(String[] args) {
		
		Singltone obj1 =new Singltone();
		Singltone obj2 =new Singltone();
		
		System.out.println("obj1 "+obj1.hashCode());
		System.out.println("obj2 "+obj2.hashCode());
		
		obj1.getObject();
		obj2.getObject();
	}



	public static Singltone s= null;

	public Singltone() {
	}

	public static Singltone getObject() {
		if (s == null) {
			s = new Singltone();
			
		}
		System.out.println(s.hashCode());
		return s;
	}

}
