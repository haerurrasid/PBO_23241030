import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("Kalkulator Sederhana");
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Pilih operator (+, -, *, /): ");
            char operator = input.next().charAt(0);

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            double hasil = 0;
            boolean validOperator = true;

            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        validOperator = false;
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid.");
                    validOperator = false;
                    break;
            }

            if (validOperator) {
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (y/n): ");
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        // Menutup scanner
        input.close();
        System.out.println("Terima kasih telah menggunakan kalkulator!");
    }
}