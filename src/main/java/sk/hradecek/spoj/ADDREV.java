package sk.hradecek.spoj;

import java.util.Scanner;
import java.util.function.Function;

/**
 * @see <a href="https://www.spoj.com/problems/ADDREV">ADDREV - Adding Reversed Numbers</a>
 */
public class ADDREV {

    public static void main(String[] args) {
        new Inputs().read(new Solution()::solve);
    }

    static class Inputs {

        private static final Scanner STDIN = new Scanner(System.in);

        void read(Function<int[], Integer> solution) {
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

        int solve(int[] pair) {
            return reverse(sumOfReversed(pair));
        }

        private static int sumOfReversed(int[] numbers) {
            return reverse(numbers[0]) + reverse(numbers[1]);
        }

        private static int reverse(int number) {
            int result = 0;

            while (number > 0) {
                int lastDigit =  number % 10;
                result = result * 10 + lastDigit;
                number /= 10;
            }

            return result;
        }
    }
}
