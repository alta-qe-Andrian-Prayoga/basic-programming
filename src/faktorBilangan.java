public class faktorBilangan {
    public static void main(String[] args) {
        int bilangan;

        //proses
        bilangan = 20;
        int s;
        for (int i = 1; i <= bilangan; i++){
            s = bilangan % i;
            if (s == 0){
                System.out.println(i);
            }
        }
    }
}
