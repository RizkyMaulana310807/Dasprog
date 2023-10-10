import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f;
        System.out.println("------====== Program java mengkonfersi suhu dari fahrenheit ======------");
        System.out.println("");
        System.out.print("Masukan fahrenheit : ");
        f = input.nextDouble();
        double celcius = (5.0 / 9.0) * (f - 32);
        System.out.println("Suhu fahrenheit : " + celcius + "°C");
        double reamur = (4.0 / 9.0) * (f - 32);
        System.out.println("Suhu reamur : " + reamur + "°RE");
        System.out.println("");
        System.out.println("------====== Program selesai ======------");
        input.close();
    }
}
