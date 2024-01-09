import java.util.Scanner;

public class Kelvin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double k;
        System.out.println("------====== Program java mengkonfersi suhu dari kelvin ======------");
        System.out.println("");
        System.out.print("Masukan kelvin : ");
        k = input.nextDouble();
        double celcius = k - 273;
        System.out.println("Suhu celcius : " + celcius + "°C");
        double reamur = (4.0 / 5.0) * (k - 273);
        System.out.println("Suhu reamur : " + reamur + "°RE");
        System.out.println("");
        System.out.println("------====== Program Selesai ======------");
        input.close();
    }
}
