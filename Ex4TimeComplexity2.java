public class CodilityEx4TimeComplexity2 {

    public int solution(int[] A) {

        int sum = 0;

        for (int i = 0; i < A.length ; i++) {
            sum += A[i];
        }

        int sumLeft = 0;
        int diff = Math.abs(A[0]-(sum-A[0]));

        for (int i = 1; i < A.length; i++) {
            sumLeft += A[i-1];
            int tempDiff = Math.abs(sumLeft - (sum-sumLeft));
            if(tempDiff<diff){
                diff = tempDiff;
            }
        }
        return diff;
    }
}
