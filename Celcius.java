import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);     
    double c;
    System.out.println("------====== Program java konfersi dari celcius ======------");
    System.out.println("");
        System.out.print("Masukan celcius : ");
        c = input.nextDouble();

        double reamur = (4.0 / 5.0) * c;
        System.out.println("Suhu reamur : " + reamur + "°RE");
        double fahrenheit = (9.0 / 5.0 ) * c + 32;
        System.out.println("Suhu fahrenhite : " + fahrenheit + "°F");
        double kelvin = c + 273.15;
        System.out.println("Suhu kelvin : " + kelvin + " K");
        System.out.println("");
        System.out.println("------====== Program Selesai ======------");
    input.close();
    }
}
