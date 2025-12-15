public class arrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 8;
        numbers[4] = 10;
        numbers[5] = 12;
        numbers[6] = 14;
        numbers[7] = 16;
        numbers[8] = 18;
        numbers[9] = 20;
        System.out.println("the original array is:");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(+numbers[i] + " ");
            }
        numbers[6] = 45;
        System.out.println();
        System.out.println("the modified element at index 6 is :" + numbers[6]);
        System.out.println("the modified array is:");
        for (int j = 0;j<numbers.length ;j++){
            System.out.print(numbers[j]+" ");
        }

    }
}