import java.util.Scanner;

public class Reamur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r;
        System.out.println("------====== Program java konfersi dari reamur ======------");
        System.out.println("");
        System.out.print("Masukan reamur : ");
        r = input.nextDouble();
        double celcius = (5.0 / 4.0) * r;
        System.out.println("Suhu celsius : " + celcius + "°C");
        double fahrenheit = (9.0 / 4.0) * r + 32.0;
        System.out.println("Suhu fahrenheit : " + fahrenheit + "°F");
        double kelvin = (5.0 / 4.0) * r + 273.15;
        System.out.println("Suhu kelvin : " + kelvin + " Kelvin");
        System.out.println("------====== Program selesai ======------");
        input.close();
    }
}
