package sk.hradecek.spoj;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import sk.hradecek.spoj.ADDREV.Solution;

public class ADDREVTest {

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][] {
                { new int[] { 24, 1}, 34 },
                { new int[] { 4358, 754}, 1998 },
                { new int[] { 305, 794 }, 1 }
        };
    }

    @Test(dataProvider = "testCases")
    public void basic(int[] input, int expectedResult) {
        Assert.assertEquals(new Solution().solve(input), expectedResult);
    }
}
