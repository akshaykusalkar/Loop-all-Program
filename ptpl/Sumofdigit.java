package co.ptpl;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of digits of given number
		
		 int i=521;
	        
	        int sum=0;
	        while(i>0)
	        {
	               int r=i%10;
	                sum=sum+r;
	                i=i/10;       
	        }
	         System.out.println("Sum of digits of 521 is "+sum);         
	         

	}

}
