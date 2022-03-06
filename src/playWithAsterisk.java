public class playWithAsterisk {

    private static void bintang(int n){
        int space = n-1;
        for (int x = 1; x <= n; x++){
            for (int y = space; y >=1; y--){
                System.out.print(" ");
            }
            for (int z = 1; z <=x; z++){
                System.out.print("* ");
            }
            System.out.println(" ");
            space--;
        }
    }

    public static void main(String[] args) {
        bintang(5);
    }
}
