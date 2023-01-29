import java.math.BigInteger;//untuk mengimport big integer
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner in = new Scanner(System.in);
		
		BigInteger A = in.nextBigInteger();//scanner untuk big integer
		BigInteger B = in.nextBigInteger();//scanner untuk big integer
		
		BigInteger C = A.add(B);//penjumlahan jika menggunakan big integer
		BigInteger D = A.multiply(B);//perkalian jika menggunakan big integer
		
		in.close();
		System.out.println(C);
		System.out.println(D);
		
		
	
	}
}
