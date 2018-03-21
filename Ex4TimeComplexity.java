public class CodilityEx4TimeComplexity {

    public long solution(int[] A) {


        if(A.length == 1) {
            System.out.println("Array has only one element: ");
            return A[0];
        } else {
            long diff = Long.MAX_VALUE;
            for (int i = 1; i < A.length; i++) {
                long sumLeft = 0;
                long sumRight = 0;
                for (int j = 0; j < i; j++) {
                    sumLeft += A[j];
                }
                for (int j = i; j < A.length; j++) {
                    sumRight += A[j];
                }
                long diffTemp = Math.abs(sumLeft - sumRight);
                if (diffTemp < diff) {
                    diff = diffTemp;
                }
            }
         return diff;
        }
    }
}
