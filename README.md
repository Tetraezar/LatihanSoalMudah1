import java.util.Scanner; <-- Scanner

public class SoalMudah1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    <------ Disini Kita Buat Scanner Dulu
        int Panjang;     <---- Lalu kita masukkan variabel yang akan ada dalam program seperti panjang, lebar, jarak, dll.
        int Lebar;
        int Tinggi;
        int Biaya;
        int Berat;
        int Jarak;
        int HargaVolume;
        int BiayaJarak;

        //Menasukkan Jarak Pengiriman      <-------- Lalu kita buat sout untuk memasukkan jarak pengiriman paket (dalam KM) diikuti dengan scannernya
        System.out.println("Masukkan Jarak Pengiriman Paket Dalam KM : ");
        Jarak = input.nextInt();

        //Pengecekan Apakah Jarak Pengiriman Paket Lebih Dari 10 km      <-------- Lalu kita buat perhitungan jika jarak lebih dari 10 maka biayanya adalah 6.000 per kg
        if (Jarak <= 10) {                                                         dan jika kurang dari samadengan 10 Biayanya 4.250 per KG
            BiayaJarak = 4250;
        } else {
            BiayaJarak = 6000;
        }

        //Memasukkan Panjang, Lebar, Tinggi Paket dan Menghitung Volumenya      <------- Kita buat sout diikuti Scanner lagi tentang Volume paket, dimana kita perlu Panjang, Lebar, dan Tinggi.
        System.out.println("Masukkan Panjang Paket : ");                                 lalu kita buat untuk menghitung volumenya, yakni Panjang*Lebar*Tinggi
        Panjang = input.nextInt();
        System.out.println("Masukkan Lebar Paket : ");
        Lebar = input.nextInt();
        System.out.println("Masukkan Tinggi Paket : ");
        Tinggi = input.nextInt();
        int Volume = Panjang*Lebar*Tinggi;

        //Pengecekan Apakah Besar Volume Paket Lebih Dari 100 cm^3        <-------- Lalu kita buat perhitungan jika Volume lebih dari 100 cm^3 maka dikenakan biaya sebesar 50.0000
        if (Volume > 100) {                                                         tapi kalau volumenya dibawah 100 tidak dikenakan biaya atau 0.
            HargaVolume = 50000;
        } else {
            HargaVolume = 0;
        }

        //Memasukkan Berat Paket      <-------------- Lalu kita buat sout untuk memasukkan Berat paket (dalam KG) diikuti dengan scannernya
        System.out.println("Masukkan Berat Paket Dalam KG : ");
        Berat = input.nextInt();

        //Menghitung Total Biaya Pengiriman Paket       <------------ Diakhir tinggal dihitung totalnya dengan cara HargaVolume + (BiayaJarak * Berat).
        Biaya = HargaVolume+(BiayaJarak*Berat);                       Lalu tinggal ditampilkan hasil dari program.
        System.out.println("Biaya Pengriman Adalah : RP. " + Biaya);
        System.out.println("Volume Paket Anda : " + Volume + " CM^3");
        System.out.println("Jarak Pengiriman Paket Anda : " + Jarak + " KM");
        System.out.println("Berat Paket Anda : " + Berat + " KG");              <--------- Kalau Jarak = 15 KM, Volumenya = 200 cm^3, dan Berat = 5 KG, Maka Total Biaya adalah : RP. 80.000


        input.close();
    }  <img width="1920" height="1200" alt="Screenshot 2025-11-03 101951" src="https://github.com/user-attachments/assets/f571395e-7991-4807-8513-367e9570ec0f" />      <--- SS Output

    
}
