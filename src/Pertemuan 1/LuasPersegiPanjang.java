package Pert1;
import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Panjang: ");
        double panjang= input.nextDouble();
        
        System.out.print("Masukan Lebar: ");
        double lebar = input.nextDouble();
        
        double hasil = panjang*lebar;

        System.out.println(hasil);
        input.close();
    }
}
