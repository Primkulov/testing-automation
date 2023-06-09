package test;

import org.junit.Test;
import utilities.Driver;

public class Google {

    @Test
    public void test(){
        Driver.getDriver().get("https://google.com");
    }

}
