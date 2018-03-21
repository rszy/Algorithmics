import java.util.ArrayList;

public class CodilityEx1Itearation {


        public int solution(int N) {
            String binaryString = Integer.toBinaryString(N);
            ArrayList<Integer> binaryList = new ArrayList<>();
            int maxGab = 0;
            for (int i = 0; i < binaryString.length(); i++) {
                binaryList.add(Character.getNumericValue(binaryString.charAt(i)));
            }

            for (int i = binaryList.size() - 1; i >= 1; i--) {
                if (binaryList.get(i) == 1 && binaryList.get(i - 1) == 0) {
                    int index = i - 1;
                    int counter = 0;
                    while (binaryList.get(index) == 0) {
                        counter++;
                        index--;
                    }
                    if (counter > maxGab) {
                        maxGab = counter;
                    }
                }

            } return maxGab;
        }

}
