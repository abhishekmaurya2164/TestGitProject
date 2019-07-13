package testing;

public class Paitern3{
/*
	1
	3 2
	4 5 6
	10 9 8 7 

*/

	public static void main(String[] args) {
		
		int k=1,l=0;
		for (int i=1;i<=5;i++ ) {
			l=k+i-1;
			for (int j=1;j<=i ;j++ ) {
				
				if(i%2==1)
					System.out.print(k+" ");
				else 
					System.out.print(l+" ");
				k++;
				l--;
			}
			System.out.println();
		}





	}
}