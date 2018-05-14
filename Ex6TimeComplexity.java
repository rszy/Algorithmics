public class CodilityEx6TimeComplexity {

    public int solution(int[] A) {

        int sumA = 0;
        int sumN = ((1+A.length+1)*(A.length+1))/2;

        for (int i = 0; i < A.length; i++) {
            sumA = sumA + A[i];
        }
        return sumN - sumA;
    }
}
