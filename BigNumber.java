import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner in = new Scanner(System.in);
		
		BigInteger A = in.nextBigInteger();
		BigInteger B = in.nextBigInteger();
		
		BigInteger C = A.add(B);
		BigInteger D = A.multiply(B);
		
		in.close();
		System.out.println(C);
		System.out.println(D);
		
		
	
	}
}