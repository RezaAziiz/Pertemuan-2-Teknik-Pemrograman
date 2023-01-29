import java.util.Scanner;

public class Berhitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); 
		
		int x = in.nextInt();
		char operator = in.next().charAt(0);
		int y = in.nextInt();
		
		
		
	    
	     
	    if(operator=='+') {
	    	int z = x + y;
	    	 System.out.println(z);
	    }
	    else if(operator=='-') {
	    	int z = x - y;
	    	 System.out.println(z);
	    }
	    else if(operator=='*') {
	    	int z = x * y;
	    	 System.out.println(z);
	    }
	    else if(operator=='/') {
	    	int z = x/y;
	    	 System.out.println(z);
	    }
	    else if(operator=='%') {
	    	int z = x%y;
	    	 System.out.println(z);
	    }
	    
	    //System.out.println(z);
	    
		
	}

}
