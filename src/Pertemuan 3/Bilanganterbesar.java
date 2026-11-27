import java.util.Scanner;

public class Bilanganterbesar {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Masukan Angka ke -1: ");
        a = input.nextInt();
        System.out.print("Masukan Angka ke -2: ");
        b = input.nextInt();

        if (a < b ){
            System.out.print("Angka terbesar adalah " + b);
        }else if (a > b ) {
            System.out.print("Angka Terbesar Adalah " + a);
        }else {
            System.out.print("Angka Sama besar!");
        }
        input.close();
    }    
}
