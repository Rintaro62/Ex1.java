package BaseTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestThird {
    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }
    @Test(dataProvider = "SetEnvironment")
    public void Test3(String s1,String s2) {
        System.out.println(s1 + s2);


        }
    }

