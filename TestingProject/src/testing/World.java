package testing;

public class World {
	 public static void main(String[] args) {
	 	System.out.println("hello world");

	 	int ar[]=new int[2];
	 	System.out.println(ar[0]);
	 	System.out.println(ar[1]);
	 	//System.out.println(ar[2]);// run time error  java.lang.ArrayIndexOutOfBoundsException
	 	
	 	
	 	int a=1; float b=2; double c=3; long l=5; byte d=127;
	 	double p = c/b;//c/b
        double q = b/a;//b/a
        double r =c/a ;//c/a
        double m = r+l;//r+l
        int s = a/d;//a/d
        
        
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
        
       
	 }
}