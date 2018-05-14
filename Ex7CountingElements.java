public class CodilityEx7CountingElements {

    public int solution(int[] A) {

        int sumA = 0;
        int sumN = 0;

        for (int i = 1; i <= A.length; i++) {
            sumN += i;
        }

        for (int i = 0; i < A.length; i++) {
            sumA = sumA + A[i];
        }

        if (sumA == sumN)
            return 1;
        else
            return 0;

    }
}
