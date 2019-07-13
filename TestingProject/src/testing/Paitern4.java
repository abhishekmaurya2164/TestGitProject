package testing;


/*1
01
101
0101
*/






public class Paitern4{
	public static void main(String[] args) {
		int i=0,j=0;
			
		for (i=1;i<=4;i++ ) {
			for (j=i;j>=1;j-- ) {
				System.out.print(j%2);
			}
			System.out.println();
		}
	}
	
}