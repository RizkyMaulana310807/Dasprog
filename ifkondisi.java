import java.util.Scanner;

public class ifkondisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai;
        System.out.println("Masukan nilai : ");
        nilai = input.nextInt();
        
        System.out.println("Nilai Input : "+nilai);
        int hasil = nilai % 2;
        System.out.println("Hasil modulus : "+hasil);

        if(hasil == 0){
        System.out.println("Nilai Genap");
        } else{
            System.out.println("Nilai Ganjil");
        }
        input.close();
    }
}
