public class xyz {

    private static void DrawXYZ(int n){
        int index = 0;
        for (int x = 1; x <= n; x++){
            for (int y = 1; y <= n; y++){
                index = index + 1;
                if(index % 2 != 0)
                {
                    if (index % 3 == 0){
                        System.out.print("X ");
                    }else {
                        System.out.print("Y ");
                    }
                }else {
                    if (index % 3 == 0){
                        System.out.print("X ");
                    }else {
                        System.out.print("Z ");
                    }
                }

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        DrawXYZ(5);
    }
}
