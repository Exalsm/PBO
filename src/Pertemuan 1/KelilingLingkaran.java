import java.util.Scanner;

public class KelilingLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Jari-jari (r): ");
        double r= input.nextDouble();
        
        double hasil = Math.PI *2 * r;

        System.out.println(hasil);
        input.close();
    }
}
