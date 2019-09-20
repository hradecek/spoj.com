package sk.hradecek.spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Predicate;

/**
 * @see <a href="https://www.spoj.com/problems/TEST/>TEST - Life, the Universe, and Everything</a>
 */
public class TEST {

    private static final Predicate<Integer> IS_NOT_THE_ULTIMATE_QUESTION_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING =
            number -> number != 42;

    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .map(Integer::parseInt)
                .takeWhile(IS_NOT_THE_ULTIMATE_QUESTION_TO_LIFE_THE_UNIVERSE_AND_EVERYTHING)
                .forEach(System.out::println);
    }
}
