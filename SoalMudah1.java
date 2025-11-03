import java.util.Scanner;

public class SoalMudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Panjang;
        int Lebar;
        int Tinggi;
        int Biaya;
        int Berat;
        int Jarak;
        int HargaVolume;
        int BiayaJarak;

        //Menasukkan Jarak Pengiriman
        System.out.println("Masukkan Jarak Pengiriman Paket Dalam KM : ");
        Jarak = input.nextInt();

        //Pengecekan Apakah Jarak Pengiriman Paket Lebih Dari 10 km
        if (Jarak <= 10) {
            BiayaJarak = 4250;
        } else {
            BiayaJarak = 6000;
        }

        //Memasukkan Panjang, Lebar, Tinggi Paket dan Menghitung Volumenya
        System.out.println("Masukkan Panjang Paket : ");
        Panjang = input.nextInt();
        System.out.println("Masukkan Lebar Paket : ");
        Lebar = input.nextInt();
        System.out.println("Masukkan Tinggi Paket : ");
        Tinggi = input.nextInt();
        int Volume = Panjang*Lebar*Tinggi;

        //Pengecekan Apakah Besar Volume Paket Lebih Dari 100 cm^3
        if (Volume > 100) {
            HargaVolume = 50000;
        } else {
            HargaVolume = 0;
        }

        //Memasukkan Berat Paket
        System.out.println("Masukkan Berat Paket Dalam KG : ");
        Berat = input.nextInt();

        //Menghitung Total Biaya Pengiriman Paket
        Biaya = HargaVolume+(BiayaJarak*Berat);
        System.out.println("Biaya Pengriman Adalah : RP. " + Biaya);
        System.out.println("Volume Paket Anda : " + Volume + " CM^3");
        System.out.println("Jarak Pengiriman Paket Anda : " + Jarak + " KM");
        System.out.println("Berat Paket Anda : " + Berat + " KG");


        input.close();
    }
    
}
