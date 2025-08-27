package exercicios;

public class SolutionSeven {
    public int mySqrt(int x) {
        Double squreSqr = Math.sqrt(x);
        int  resultRound = (int) Math.floor(squreSqr);
        return resultRound;
    }
}
