package BaseTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestSecond {

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void Test2(String str1,String str2) {

        System.out.println(str1);
        System.out.println(str2);

    }

}
