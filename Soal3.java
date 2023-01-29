import java.util.Scanner;

public class Soal3 {
	int i;
	String kata;
	public static void main (String[]args) {
	
	Scanner keyboard = new Scanner(System.in);
	
	String kalimat = keyboard.nextLine();
    String[] space = kalimat.split("[ , !, ?, ', :, ]");
    System.out.println(space.length);
    for(String hasil : space) {
    	System.out.println(hasil);
    }
}
}