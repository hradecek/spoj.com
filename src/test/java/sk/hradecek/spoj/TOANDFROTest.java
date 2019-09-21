package sk.hradecek.spoj;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static sk.hradecek.spoj.TOANDFRO.Solution;

public class TOANDFROTest {

    @DataProvider(name = "testCases")
    public Object[][] testCases() {
        return new Object[][] {
                { 5, "toioynnkpheleaigshareconhtomesnlewx", "theresnoplacelikehomeonasnowynightx" },
                { 3, "ttyohhieneesiaabss", "thisistheeasyoneab" }
        };
    }

    @Test(dataProvider = "testCases")
    public void basic(int numOfColumns, String message, String expectedResult) {
        Assert.assertEquals(new Solution().solve(message, numOfColumns), expectedResult);
    }
}
