public class ubahHuruf {
    private static String ubahHuruf(String s){
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] alphabetBob = new char[26];
        String huruf = "";
        for (int i = 0; i < alphabet.length; i++){
            int sub = 0;
            sub = i + 10;
            if (sub > 25){
                sub = sub - 26;
                alphabetBob[i] = alphabet[sub];
            }else {
                alphabetBob[i] = alphabet[sub];
            }
        }
        for (int x = 0; x < s.length(); x++){
            for (int y = 0; y < alphabet.length; y++){
                if (s.charAt(x) == alphabet[y]){
                    huruf = huruf + alphabetBob[y];
                }
            }
        }
        return huruf;
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE")); //COZEVCK YUO
        System.out.println(ubahHuruf("ALTERRA ACADEMY")); //KVDOBBK KMKNOWI
        System.out.println(ubahHuruf("INDONESIA")); //SXNYXOCSK
        System.out.println(ubahHuruf("GOLANG")); //QYVKXQ
        System.out.println(ubahHuruf("PROGRAMMER")); //ZBYQBKQQOB
    }
}
