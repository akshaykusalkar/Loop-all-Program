package co.ptpl;

public class NestedWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nested while loop example
		
		 int a = 1, b;

	        while (a <= 5) {
	            b = 1;
	            while (b <= a) {
	                System.out.print("* ");
	                b++;
	            }
	            a++;
	            System.out.println();
	        }

	}

}
