public class mean {
    private static float Mean(float[] numbers){
        float tambah = 0;
        for (int i = 0; i < numbers.length; i++){
            tambah = tambah + numbers[i];
        }
        return tambah / numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value)); // 2.5
    }
}
