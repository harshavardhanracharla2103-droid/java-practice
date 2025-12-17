public class bubblesort {
    public static void bublesort(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};
        bublesort(data);
        System.out.println("Sorted array:");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    } 
    
}
