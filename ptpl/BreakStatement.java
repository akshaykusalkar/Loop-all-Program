package co.ptpl;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Break statment in for loop example
		
		for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5){
                break;
            }
        }
        System.out.println("loop over");
    }

	}


