package co.ptpl;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum of even odd using while loop
		
		 int i;
	        int sum = 0;
	        int sum1 = 0;
	        for (i = 0; i <= 10; i++) {
	            if (i % 2 == 0) {
	                sum = sum + i;
	            } else {
	                sum1 = sum1 + i;
	            }
	        }
	        System.out.println("sum of even nos is : " + sum);
	        System.out.println("sum of odd nos is : " + sum1);

	}

}
