public class tugasArray {
    public static void main(String[] args) {
        char[] nama_siswa = {'D', 'E', 'N', 'Y'};
        System.out.print("Nama siswa : ");
        for(int i = 0; i < nama_siswa.length; i++){
            System.out.print(nama_siswa[i]);
        }
        System.out.println("");

        double[] nilai = {80, 80, 80, 89};
        System.out.println("Nilai Siswa : ");
        for(int i = 0; i < nilai.length; i++){
            System.out.println(nilai[i]);
        }
        double[] rata_rata = {80, 80, 80, 89};
        double sum = 0;
        int i;
        for(i = 0; i < rata_rata.length; i++){
            sum += rata_rata[i];
        }
        System.out.println("Nilai rata rata : " + sum / rata_rata.length);
        // double nilai_rata_rata = nilai[0] + nilai[1] + nilai[2] + nilai[3];
        // System.out.print("Nilai Rata rata : ");
        // System.out.println(nilai_rata_rata / nilai.length);

    }
}
