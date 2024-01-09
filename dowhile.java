public class dowhile {
    static void perulanganDoWhile(){
        //Perulangan menggunakan do while
        System.out.println("|| Do While Perulangan ||");
        int i = 1;
        do {
            System.out.print(i + ", ");
            i += 2;
        } while (i <= 100);
        System.out.println("");
        System.out.println("|| Do While perulangan ||");
        
        int j = 2;
        do{
            System.out.print(j + ", ");
            j += 2;
        } while (j <= 100);
    }
    static void perulanganWhile(){
        //Perulangan menggunakan While
        System.out.println("");
        System.out.println("|| While perulangan ||");
        int k = 1;
        while (k <= 100) {
            System.out.print(k + ", ");
            k += 2;
        }
        System.out.println("");
        System.out.println("|| While perulangan ||");
        int l = 2;
        while (l <= 100) {
            System.out.print(l + ", ");
            l += 2;
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        perulanganDoWhile();
        perulanganWhile();
    }
}
