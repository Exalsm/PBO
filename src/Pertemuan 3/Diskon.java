import java.util.Scanner;

public class Diskon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double bayar;
        double diskon;
        double harga;
        System.out.print("Masukan Total Belanja : ");
        bayar = input.nextDouble();
        if (bayar >= 15000){
            diskon = bayar * 0.1;
            harga = bayar - diskon;
            System.out.println("Kamu mendapatkan potongan 10%");
            System.out.print("Harga Produk Menjadi: "+ harga);
        } else {
            System.out.println("Anda Tidak Dapat Diskon! ");
            System.out.print("Silahkan bayar: "+ bayar);

        }
        input.close();
    }    
}
