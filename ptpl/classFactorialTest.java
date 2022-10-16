package co.ptpl;

public class classFactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to Calculate the Factorial of the Given Number.
		
int i, n;
		
		n = 5;

		int f = 1;
		for( i=n ; i>=1 ; i-- )
		{
			f = f * i ;
		}
		System.out.println( "\n The Factorial of " + n + " is = " + f );

	}

}
