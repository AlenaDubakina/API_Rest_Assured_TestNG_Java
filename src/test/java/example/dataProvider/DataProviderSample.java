package example.dataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderSample {
    @DataProvider(name = "dataProvider")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{
                {1, "one"},
                {10, "ten"}
        };
    }
}