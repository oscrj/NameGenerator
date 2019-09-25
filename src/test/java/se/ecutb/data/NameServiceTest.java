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

    @Test
    public void get_Random_Male_Name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomMaleName();
        Assert.assertNotNull( result);
    }

    @Test
    public void get_Random_Female_Name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomFemaleName();
        Assert.assertNotNull( result);
    }

    @Test
    public void get_Random_Last_Name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomLastName();
        Assert.assertNotNull(result);
    }

    @Test
    public void get_Multiply_random_names(){
        NameService testObject = new NameService();
        int testNumberOfNames = 2;
        Assert.assertNotNull(testObject.getMultiplyRandomNames(testNumberOfNames));
        Assert.assertEquals(2, testObject.getMultiplyRandomNames(testNumberOfNames).size());
    }
}
