public class BubbleSort {

    // Version 1: while loop (early exit)
    public static void bubbleSortWhile(int[] arr) {
        boolean finished = false;
        int n = arr.length - 1;

        while (!finished) {
            int numSwaps = 0;
            for (int i = 0; i < n; i++) {   // current element
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    numSwaps++; 
                }
            }
            if (numSwaps == 0) {    // if a pass is done and no swaps are done, exit 
                finished = true;
            }
        }
    }

    // Version 2: nested loop
    public static void bubbleSortFor(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {        // pass number
            for (int j = 0; j < n; j++) {    // current element
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;   
            }
       } 
    }

    public static void main(String[] args) {
        int[] sample1 = {21, 45, 6, 33, 9, 13, 58, 12, 3};
        int[] sample2 = sample1.clone();

        bubbleSortWhile(sample1);
        bubbleSortFor(sample2);

        System.out.println("Sorted with while loop: ");
        for (int num : sample1) System.out.print(num + " ");
        
        System.out.println("\n");   // black space

        System.out.println("Sorted with for loops: ");
        for (int num : sample1) System.out.print(num + " ");}
}