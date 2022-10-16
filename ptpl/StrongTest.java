package co.ptpl;

public class StrongTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program to Check the given Number is STRONG Number or not.
		// Logic 145 = 1! + 4! + 5!  (i.e.,  145 = 1 + 24 + 120 )
		
int n, x, r, sum, f, i;
		
		n = 145;
		x = n;
		
		sum = 0;
		while( n != 0 )
		{
			r = n % 10;
			f = 1;
			for( i=1 ; i<=r ; i++ )
			{
				f = f * i;
			}
			sum = sum + f;
			n = n / 10;
		}
		
		if( sum == x )
			System.out.println( x + " is a STRONG Number." );
		else
			System.out.println( x + " is not a STRONG Number." );

	}

}
