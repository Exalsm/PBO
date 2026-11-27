import java.util.Scanner;

//program Menghitung Volume bola
public class TipeData {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);        
        System.out.print("Masukan Jari-Jari: ");
        double jari = input.nextDouble();
        double volume = (4/3)* Math.PI * Math.pow (jari, 3);
        System.out.println("Volume: " + volume);
        input.close();
    }
}