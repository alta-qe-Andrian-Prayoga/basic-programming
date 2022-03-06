public class bilanganPrima {

    static boolean primeNumber(int number){
        boolean hasil;
        hasil = true;
        int x = 0;
        for (int i = 1; i <= number; i++){
              if (number % i ==  0){
                  x++;
              }
        }
        if (x==2){
            hasil = true;
        }else {
            hasil = false;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11)); //true
        System.out.println(primeNumber(13)); //true
        System.out.println(primeNumber(17)); //true
        System.out.println(primeNumber(20)); //true
        System.out.println(primeNumber(35)); //true
    }
}
