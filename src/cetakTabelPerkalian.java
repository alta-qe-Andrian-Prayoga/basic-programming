public class cetakTabelPerkalian {

    private static void tabelPerkalian(int n){
        for (int x = 1; x <= n; x++){
            System.out.print(x);
            for (int y = 2; y <= n; y++){
                System.out.print("  " + y * x );
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        tabelPerkalian(9);
    }
}
