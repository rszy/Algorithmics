public class ExBinaryPeriod {

    public int solution(int N) {

        String binaryN = Integer.toBinaryString(N);
        String[] strings = binaryN.split("");
        int[] ints = new int[strings.length];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        int q = ints.length;
        int p = q / 2;
        int counter = 0;
        int result = -1;

        for (int i = p; i > 0; i--) {

            for (int j = 0; j < q - i; j++) {
                if (ints[j] != ints[j + i]) {
                    break;
                } else {
                    counter++;
                }
            }
            if ((counter+i)/2 == p) {
                result = i;
                counter = 0;
            } else {
                counter = 0;
            }

        }

        if (counter != 0) {
            result = counter;
        }

        return result;

    }
}
