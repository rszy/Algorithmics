public class SelectionSort {

    public int[] sort(int[] A) {

        for (int i = 0; i < A.length; i++) {
            int minimum = A[i];
            int key = i;
            for (int j = i; j < A.length; j++) {
                if (A[j] < minimum) {
                    minimum = A[j];
                    key = j;
                }
            }
            A[key] = A[i];
            A[i] = minimum;
        }
        return A;
    }
}
