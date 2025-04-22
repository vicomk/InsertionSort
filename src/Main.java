public class Main {
    public static void main(String[] args) {
        int[] array = {256,2,56,221,89,65,315,3561,1};

        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }

    //Method to print an Array
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.print(array[i] + "]");
                break;
            }
            System.out.print(array[i] + ", ");
        }
    }
}
