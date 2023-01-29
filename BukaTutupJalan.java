import java.util.Scanner;
public class BukaTutupJalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Keyboard = new Scanner(System.in);
		
		String str = Keyboard.nextLine();
		
		String str2 = str.replaceAll(" ","");//untuk mereplace spasi menjadi tidak ada spasi
		Long number = Long.parseLong(str2);//untuk mengconvert nilai string menjadi long
		
		
		if((number-999999)%5==0){
			System.out.println("Jalan");
		}
		else {
			System.out.println("Berhenti");
		}
		

	}

}
