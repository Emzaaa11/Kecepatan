import java.util.Scanner;

public class HitungKecepatan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jarak (meter): ");
            double s = sc.nextDouble();
            System.out.print("Masukkan waktu (detik): ");
            double t = sc.nextDouble();

            if(t == 0) {
                System.out.println("Waktu tidak boleh 0! Perhitungan dibatalkan.");
            } else {
                double v = s / t;
                System.out.println("Kecepatan = " + v + " m/s");
            }

            System.out.print("Hitung lagi? (y/n): ");
            char ulang = sc.next().charAt(0);

            if(ulang == 'n' || ulang == 'N') {
                System.out.println("Program selesai.");
                break;
            }
        }

        sc.close();
    }
}

