package sk.hradecek.spoj;

import java.util.Scanner;
import java.util.function.UnaryOperator;

/**
 * @see <a href="https://www.spoj.com/problems/SAMER08F/">SAMER08F - Feynman</a>
 */
public class SAMER08F {

    public static void main(String[] args) {
        new Inputs().read(new Solution()::solve);
    }

    static class Inputs {

        private static final Scanner STDIN = new Scanner(System.in);

        void read(UnaryOperator<Integer> solution) {
            int input = STDIN.nextInt();
            while (input != 0) {
                System.out.println(solution.apply(input));
                input = STDIN.nextInt();
            }
        }
    }

    static class Solution {

        private int[] squares;

        int solve(int squareSize) {
            squares = new int[squareSize + 1];
            squares[0] = 0;
            for (int i = 1; i <= squareSize; ++i) {
                squares[i] += squares[i - 1] + Math.pow(i, 2);
            }

            return squares[squareSize];
        }
    }
}
