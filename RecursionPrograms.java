package recursion1;
//22-01-2025
public class Recursion2 {
  // recursion function
	static void printnum(int n)
	{
		if(n==0)
		{
			return;

	
		}
		System.out.println(n);
		printnum(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
		printnum(5);
	

	}


}

// digitreverse
package recursion1;
//22-01-25
public class Digitreverse {
	        static  int sum=0;
	  static int  reverse(int n) {
		if (n==0) {
			return sum;
		}
		sum=sum*10 +(n%10);
		  return reverse(n/10);
	}

	public static void main(String[] args) {
		int res = reverse(1253);
		System.out.println(res);
	}

}

// countzeroes
package recursion1;
//22-01-25
public class Countzeroes {
    static  int count=0;
static int  reverse(int n) {
if (n==0) {
	return count;
}
if(n%10==0)
{
	 ++count;
}

  return reverse(n/10);
}


	public static void main(String[] args) {
		long res = reverse(0);
		System.out.println(res);

	}

}
