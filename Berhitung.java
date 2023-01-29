import java.util.Scanner;

public class Berhitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in); //scanner untuk input 
		
		int x = in.nextInt();//untuk input nilai integer
		char operator = in.next().charAt(0);//untuk input character yg akan menjadi operator
		int y = in.nextInt();//untuk input nilai integer
		
		
		
	    
	     //operator tambah
	    if(operator=='+') {
	    	int z = x + y;
	    	 System.out.println(z);
	    }//
	    else if(operator=='-') {
	    	int z = x - y;//operator kurang
	    	 System.out.println(z);
	    }
	    else if(operator=='*') {
	    	int z = x * y;//operator kali
	    	 System.out.println(z);
	    }
	    else if(operator=='/') {
	    	int z = x/y;//operator bagi/div
	    	 System.out.println(z);
	    }
	    else if(operator=='%') {//operator mod
	    	int z = x%y;
	    	 System.out.println(z);
	    }
	    
	    
	    
		
	}

}
