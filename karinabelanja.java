import java.util.Scanner;

public class karinabelanja {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double nilai;
        System.out.print("Uang yang di keluarkan Karina untuk berbelanja Rp.");
        nilai = input.nextDouble();
        System.out.println("Nilai yang kamu masukan : "+nilai);
        
        if(nilai >= 50000 && nilai <= 99999){
            System.out.println("====== Kamu mendapat diskon 1% ======");
        } else if(nilai >= 100000){
            System.out.println("====== Kamu mendapat diskon 2% ======");
        }
        input.close();
    }
}
