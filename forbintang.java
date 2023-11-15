public class forbintang{
    public static void main(String[] args) {
        System.out.println("=-=-=- Soal 1 -=-=-=");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=-=-=- Soal 2 -=-=-=");
        System.out.println("");
        System.out.print("  *"); //alternatif
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 2 - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=-=-=- Soal 3 -=-=-=");
        System.out.println("");
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <=1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=-=-=- Soal 4 =-=-=-");
        System.out.println("");
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}