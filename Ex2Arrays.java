public class CodilityEx2Arrays {

    public int[] solution(int[] A, int K) {


        if (A.length != 1 && A.length != 0) {
            for (int i = 0; i < K; i++) {
                int last = A[A.length-1];
                for (int j = A.length-2; j >= 0; j--) {
                    A[j+1] = A[j];
                }
                A[0] = last;
            }
        }
        return A;
    }
}

