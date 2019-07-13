package testing;

public class LenearSearch{

	int learn(int ar[],int n, int x){
		for (int i=0;i<n;i++ ) {
			if(ar[i]==x)
				return i;
		}
			return -1;
		}
	

	public static void main(String[] args) {
		LenearSearch li= new LenearSearch();
		int ar[]={1,5,6,7,9,12};
		int n=ar.length;
		int x= 9;
		int result=li.learn(ar,n,x);
		if(result==-1)
			System.out.println("not present");
		else {
			System.out.println("result at index="+result);
		}
		
	}

}