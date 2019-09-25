package se.ecutb.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NameServiceTest {

    @Test
    public void pojknamn_txt_successfully_read(){
        NameService testObject = new NameService();
        int expectedSize = 19499;

        List<String> result = testObject.maleFirstName();

        Assert.assertEquals(expectedSize, result.size());
    }

    @Test
    public void flicknamn_txt_successfully_read(){
        NameService testobject = new NameService();
        int expectedSize = 19391;
        List<String> result = testobject.femaleFirstName();
        Assert.assertEquals(expectedSize, result.size());
    }

    @Test
    public void lastnamn_txt_successfully_read(){
        NameService testobject = new NameService();
        int expectedSize = 100;
        List<String> result = testobject.lastName();
        Assert.assertEquals(expectedSize, result.size());
    }
}
