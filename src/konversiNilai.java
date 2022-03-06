public class konversiNilai {
    public static void main(String[] args) {
        // input
        int studentScore = 80;

        // proses konversi

        if(studentScore <= 100 && studentScore >= 80){
            System.out.println("Nilai Mahasiswa: A");
        } else if ( studentScore <= 79 && studentScore >= 65){
            System.out.println("Nilai Mahasiswa: B+");
        } else if ( studentScore <= 64 && studentScore >= 50){
            System.out.println("Nilai Mahasiswa: B");
        } else if ( studentScore <= 49 && studentScore >= 35){
            System.out.println("Nilai Mahasiswa: C");
        } else if ( studentScore <= 34 && studentScore >= 0){
            System.out.println("Nilai Mahasiswa: D");
        } else {
            System.out.println("Nilai Mahasiswa: invalid");
        }

    }
}
