package sk.hradecek.spoj;

import java.util.Scanner;
import java.util.function.UnaryOperator;

/**
 * @see <a href="https://www.spoj.com/problems/STRHH/">STRHH - Half of the half</a>
 */
public class STRHH {

    public static void main(String[] args) {
        new Inputs().read(new Solution()::solve);
    }

    static class Inputs {

        private static final Scanner STDIN = new Scanner(System.in);

        void read(UnaryOperator<String> solution) {
            int numberOfCases = STDIN.nextInt();
            STDIN.nextLine();
            while (numberOfCases-- > 0) {
                System.out.println(solution.apply(STDIN.nextLine()));
            }
        }
    }

    static class Solution {

        String solve(final String line) {
            final StringBuilder everySecond = new StringBuilder();
            for (int i = 0; i < line.length() / 2; i += 2) {
                everySecond.append(line.charAt(i));
            }
            return everySecond.toString();
        }
    }
}
