public class CodilityEx3Arrays {

    public int solution(int[] A) {

        int result = A[0];
        for (int i = 0; i < A.length; i++) {
            int counter = 0;
            int compare = A[i];
            for (int i1 : A) {
                if (i1 == compare) {
                    counter++;
                }
            }
            if (counter%2 != 0) {
                result = A[i];
            }
        }

        return result;
    }
}

