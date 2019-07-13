package testing;


/**
 * 
 * @author Abhishek
 *
 */

public class BinarySearch{
	
	int binary( int ar[], int l,int r, int x){
		if (r>=l) {
			int mid=l+(r-l)/2;

			if(ar[mid]==x)
				return mid;
			if(ar[mid]>x)
				return binary(ar,l,mid-1,x);
			return binary(ar,mid+1,r,x);
		}
		return -1;

	}
	
	
	public static void main(String[] args) {
		BinarySearch b= new BinarySearch();
		int ar[]={2,6,7,8,9,11,12};
		int n=ar.length;
		int x=11;
		int result= b.binary(ar,0,n-1,x);
		if(result==-1)
			System.out.println("not present");
		else {
			System.out.println("result at index="+result);
		}
	}
}