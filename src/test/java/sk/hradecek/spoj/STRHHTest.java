package sk.hradecek.spoj;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static sk.hradecek.spoj.STRHH.Solution;

public class STRHHTest {

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][] {
                { "your", "y" },
                { "progress", "po" },
                { "is", "i" },
                { "noticeable", "ntc" }
        };
    }

    @Test(dataProvider = "testCases")
    public void basic(String line, String expectedResult) {
        Assert.assertEquals(new Solution().solve(line), expectedResult);
    }
}
