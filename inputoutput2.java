import java.util.Scanner;

public class inputoutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {//looping untuk input tiga kali
			String word = in.next();//untuk input string tanpa enter/line baru
			int a = in.nextInt();//untuk input integer
			System.out.printf("%-14s %03d\n", word, a);//untuk print 14 index string dan 3 digit angka 0 
		}
		
		
		
	}

}
