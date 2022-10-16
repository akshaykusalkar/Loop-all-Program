package co.ptpl;

public class ArguSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of numbers using command line
		
		int  s = 0, len;
		len = args.length;
  
		for( int i=0 ; i<len ; i++ )
		{
			int  x = Integer.parseInt( args[ i ] );
			s = s + x;
		}
		System.out.println( " Sum of Command-Line Arguments ::: " + s );
	}

}
