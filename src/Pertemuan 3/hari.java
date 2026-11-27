import java.util.Scanner;

public class hari {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hari;
        System.out.print("Masukan Pilihan Hari (0-6): ");
        hari = input.nextInt();
        if (hari == 0)
            System.out.print("0. Hari Minggu");
        else
            if (hari == 1)
                System.out.print("1. Hari Senin");
            else
                if (hari == 2)
                System.out.print("2. Hari selasa");
                else
                    if (hari == 3)
                    System.out.print("3. Hari rabu");
                    else
                        if (hari == 4)
                        System.out.print("4. Hari kamis");
                        else
                            if (hari == 5)
                            System.out.print("5. Hari jumat");
                            else
                                if (hari == 6)
                                System.out.print("6. Hari sabtu");
        
        input.close();
    }
}
    