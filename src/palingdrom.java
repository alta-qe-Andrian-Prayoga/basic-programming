public class palingdrom {
    private static boolean palingdrome(String value){
        boolean cek = true;
        String teksKebalikan = "";
        int jmlh = value.length();
        for (int i = jmlh - 1; i >= 0; i--){
            teksKebalikan += value.charAt(i);
        }
        if (value.equalsIgnoreCase(teksKebalikan)){
            cek = true;
        }else {
            cek = false;
        }
        return cek;
    }

    public static void main(String[] args) {
        System.out.println(palingdrome("civic"));
        System.out.println(palingdrome("katak"));
        System.out.println(palingdrome("kasur rusak"));
        System.out.println(palingdrome("kupu-kupu"));
        System.out.println(palingdrome("lion"));
    }
}
