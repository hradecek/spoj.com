package sk.hradecek.spoj;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static sk.hradecek.spoj.NSTEPS.Solution;

public class NSTEPSTest {

    private static final String NO_NUMBER = "No Number";

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][]{
                { new int[] {0, 0}, "0" },
                { new int[] {0, 1}, NO_NUMBER },
                { new int[] {4, 2}, "6" },
                { new int[] {6, 6}, "12" },
                { new int[] {3, 4}, NO_NUMBER }
        };
    }

    @Test(dataProvider = "testCases")
    public void basic(int[] input, String expectedResult) {
        Assert.assertEquals(new Solution().solve(input), expectedResult);
    }
}
