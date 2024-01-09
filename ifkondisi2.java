import java.util.Scanner;
public class ifkondisi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nilai;
        System.out.print("Masukan harga baju : ");
        nilai = input.nextDouble();
        if(nilai > 50){
            System.out.println("Kamu mendapat diskon 1%");
        } else if(nilai > 100){
            System.out.println("Kamu mendaoat");
        }
        input.close();
    }
}
