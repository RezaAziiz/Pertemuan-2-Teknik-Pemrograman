import java.io.*;

/**
 *<h1>Add Two numbers!</h1>
 *The AddNum program implements an application
 *that simply adds two given integer numbers and prints
 *the output on the screen 
 *<p>
 *<b>note:</b> Giving proper comments in your program makes it more 
 *user friendly and it is assumed as a high quality code.
 *
 * @author Reza Maulana Aziiz
 * @version 1.0
 * @since 2023-01-24
 *  
 */


public class AddNum {
  /**
   * This method is used to add two integers . This is
   * a the simplest form of a class method , just to
   * show the usage of various javadoc Tags.
   * @param numA
   * @param numB
   * @return int This returns sum of a numA and numB.
   */
	
	
	public int addnum(int numA, int numB) {
		// TODO Auto-generated method stub
		return numA +numB;

	}
    /** 
     * This is the main method which makes use of addNum method.
     * 
     * @param args Unused
     * @exception IOException on input error
     * @see IOException
     */
	
	public static void main (String args[]) throws IOException {
		AddNum obj = new AddNum();
		int sum = obj.addnum(10, 20);
		
		System.out.println("sum of 10 and 20 is : "+sum);
	}
}