package sk.hradecek.spoj;

import java.util.Scanner;
import java.util.function.Function;

/**
 * @see <a href="https://www.spoj.com/problems/NSTEPS/">NSTEPS - Number Steps</a>
 */
public class NSTEPS {

    public static void main(String[] args) {
        new Inputs().read(new Solution()::solve);
    }

    static class Inputs {

        private static final Scanner STDIN = new Scanner(System.in);

        void read(Function<int[], String> solution) {
            int numberOfCases = STDIN.nextInt();

            while (numberOfCases-- > 0) {
                System.out.println(solution.apply(readPair()));
            }
        }

        private static int[] readPair() {
            return new int[]{STDIN.nextInt(), STDIN.nextInt()};
        }
    }

    static class Solution {

        private static final String NO_NUMBER = "No Number";

        String solve(int[] pair) {
            if (pair[0] == pair[1]) {
                return String.valueOf(pointOnLinearLine(0, pair[1]));
            } else if (pair[0] - pair[1] == 2) {
                return String.valueOf(pointOnLinearLine(2, pair[1]));
            } else {
                return NO_NUMBER;
            }
        }

        private int pointOnLinearLine(int start, int end) {
            int next = start, previous = start;

            for (int i = 0; i < end; ++i) {
                next = previous + (previous % 2 == 0 ? 1 : 3);
                previous = next;
            }

            return next;
        }
    }
}
