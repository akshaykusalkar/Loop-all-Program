package co.ptpl;

public class MaximumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Maximum digit from number
		
		   int i = 235;
	        int temp = 0;
	        while (i > 0) {
	            int r = i % 10;
	            i = i / 10;
	            if (temp < r) {
	                temp = r;

	            }
	        }
	        System.out.println("Max digit is "+temp);

	}

}
