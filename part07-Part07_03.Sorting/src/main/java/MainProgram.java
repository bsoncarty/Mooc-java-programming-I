
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = 999999999;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 999999999;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallestFrom = 999999999;
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallestFrom) {
                smallestFrom = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int hold = array[index1];
        array[index1] = array[index2];
        array[index2] = hold;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println(array.toString());
            MainProgram.swap(array, i, MainProgram.indexOfSmallestFrom(array, i));
        }

    }
}
