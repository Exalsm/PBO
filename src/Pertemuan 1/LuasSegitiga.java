package Pert1;
import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan alas: ");
        double alas= input.nextDouble();
        
        System.out.print("Masukan Lebar: ");
        double tinggi = input.nextDouble();
        
        double hasil = 0.5*alas* tinggi;

        System.out.println(hasil);
        input.close();
    }
}

