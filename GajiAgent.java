import java.util.Scanner;

public class GajiAgent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner in = new Scanner(System.in);//in untuk inputan
			//dekalarasi dan inisialisasi variabel
			int jumlahPenjualan;
			int gajiBersih=500000;
			int hargaItem=50000;
			int totalPenjualan;
			int gajiBonus;
			
			jumlahPenjualan = in.nextInt();//inpujt jumlah penjumlahan
			//jika penjumlahan >=40
			if(jumlahPenjualan>=40){	
			totalPenjualan = hargaItem*jumlahPenjualan;
			 gajiBonus = gajiBersih + (totalPenjualan*25/100);
			}	//jika penjumlahan >80
			else if(jumlahPenjualan>80){	
			totalPenjualan = hargaItem*jumlahPenjualan;
			gajiBonus = gajiBersih + (totalPenjualan*35/100);
			}//jika penjumlahan <15
			else if(jumlahPenjualan<15){
			jumlahPenjualan = 15-jumlahPenjualan;
			totalPenjualan = hargaItem*jumlahPenjualan;
			gajiBonus = gajiBersih - (totalPenjualan*15/100);
			}
			else {
			totalPenjualan = hargaItem*jumlahPenjualan;
			gajiBonus = gajiBersih + (totalPenjualan*10/100);	
			}
			System.out.println(gajiBonus);
	}

}
