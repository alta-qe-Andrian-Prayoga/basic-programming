public class exponentiation {

    private static int pangkat(int a, int b){
        int hasil = 1;
        for(int i = 1; i <= b; i++){
            hasil = hasil * a;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3)); //8
        System.out.println(pangkat(5, 3)); //125
        System.out.println(pangkat(10, 2)); //100
        System.out.println(pangkat(2, 5)); //32
        System.out.println(pangkat(7, 3)); //343
    }
}
