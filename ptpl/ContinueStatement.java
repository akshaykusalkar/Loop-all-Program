package co.ptpl;

public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue staement example
		
		for (int i = 0; i < 10; i++) {            
            if (i % 2 == 0) {
                continue;
		// if condition satisfied then here loop skip below part
            }
	    System.out.println(i);
        }

	}

}
