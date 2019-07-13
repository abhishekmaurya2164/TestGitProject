package threading;

class A extends Thread{

	@Override
	public void run() {
		System.out.println("hello");
	}
	
}

public class ABC {
	public static void main(String[] args) {
		A s= new A();
		s.start();
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("dusra wala");
				
			}
		});
		t.start();
	}

}
