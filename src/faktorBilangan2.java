public class faktorBilangan2 {
    public static void main(String[] args) {
        int bilangan;

        //proses
        bilangan = 20;
        int s;
        for (int i = bilangan; i >= 1; i--){
            s = bilangan % i;
            if (s == 0){
                System.out.println(i);
            }
        }
    }
}
