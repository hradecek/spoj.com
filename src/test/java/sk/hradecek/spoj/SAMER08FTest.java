package sk.hradecek.spoj;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static sk.hradecek.spoj.SAMER08F.Solution;

public class SAMER08FTest {

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][] {
                { 2, 5 },
                { 1, 1 },
                { 8, 204 }
        };
    }

    @Test(dataProvider = "testCases")
    public void basic(int input, int expectedResult) {
        Assert.assertEquals(new Solution().solve(input), expectedResult);
    }
}
