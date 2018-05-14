public class CodilityEx5TimeComplexity {

    public int solution(int X, int Y, int D) {

        int distance = Y-X;
        int solution = distance/D;
        if((solution*D)+X < Y) {
            solution++;
        }

        return solution;
    }

}
