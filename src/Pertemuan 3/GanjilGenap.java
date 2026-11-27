import java.util.Scanner;
public class GanjilGenap {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Masukan Angka : ");
        a = input.nextInt();
        if ( a % 2 == 0){
            System.out.print("Angka " + a + " Genap");
        }else {
            System.out.print("Angka " + a + " Ganjil");
        }
        input.close();
    }    
}
