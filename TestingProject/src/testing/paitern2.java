package testing;

/**
 
		1
		2 3 
		4 5 6 

 */



public class paitern2 {
	

public static void main(String[] args) {
	int num=1;
	for (int i=1;i<5 ;i++ ) {
			for (int j=i;j>1 ;j-- ) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}	
}
}