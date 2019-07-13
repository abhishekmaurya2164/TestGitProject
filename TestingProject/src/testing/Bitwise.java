package testing;

import java.util.ArrayList;
import java.util.List;

public class Bitwise {

	public static void main(String[] args) {
		
		List<Integer> l1=  new ArrayList<Integer>();
		List<Integer> l2=  new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l2.add(1);
		l2.add(2);
		System.out.println(l1+" "+l2);
		l1.removeAll(l2);
		System.out.println(l1);
		
		int a=5;
		int b=7;
		
		System.out.println("a & b is "+ a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		
	}

}
