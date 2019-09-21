package sk.hradecek.spoj;

import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * @see <a href="https://www.spoj.com/problems/TOANDFRO/">TOANDFRO - To and Fro</a>
 */
public class TOANDFRO {

    public static void main(String[] args) {
        new Inputs().read(new Solution()::solve);
    }

    static class Inputs {

        private static final Scanner STDIN = new Scanner(System.in);

        void read(BiFunction<String, Integer, String> solution) {
            int numberOfColumns = STDIN.nextInt();
            STDIN.nextLine();
            while (numberOfColumns != 0) {
                System.out.println(solution.apply(STDIN.nextLine(), numberOfColumns));
                numberOfColumns = STDIN.nextInt();
                STDIN.nextLine();
            }
        }
    }

    static class Solution {

        String solve(final String encrypted, int columns) {
            return decrypt(encrypted, columns);
        }

        private String decrypt(final String encrypted, int columns) {
            int rows = encrypted.length() / columns;
            final char[] decrypted = new char[rows * columns];
            final DecryptionFunction decryptionFunction = new DecryptionFunction(rows, columns);

            for (int idx = 0; idx < encrypted.length(); ++idx) {
                decrypted[decryptionFunction.apply(idx / columns, idx % columns)] = encrypted.charAt(idx);
            }

            return String.valueOf(decrypted);
        }

        private static class DecryptionFunction {

            private final int rows;
            private final int columns;

            DecryptionFunction(int rows, int columns) {
                this.rows = rows;
                this.columns = columns;
            }

            int apply(int row, int col) {
                return row + (row % 2 == 0 ? col * rows : (columns - 1 - col) * rows);
            }
        }
    }
}
