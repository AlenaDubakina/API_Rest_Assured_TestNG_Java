package example.dataProvider;

import org.testng.annotations.Test;

public class DataProviderSampleTest {
    @Test(dataProvider = "dataProvider",
    dataProviderClass = DataProviderSample.class)
    public void testSample(Integer digit, String word) {
        System.out.printf("%s is %s", digit, word);
    }
}