package se.ecutb.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NameServiceTest {

    NameService testObject;

    @Before
    public void setUp(){
        testObject = new NameService();

    }
    @Test
    public void pojknamn_txt_successfully_read(){
        int expectedSize = 19499;
        List<String> result = testObject.maleFirstName();
        Assert.assertEquals(expectedSize, result.size());
    }

    @Test
    public void flicknamn_txt_successfully_read(){
        int expectedSize = 19391;
        List<String> result = testObject.femaleFirstName();
        Assert.assertEquals(expectedSize, result.size());
    }

    @Test
    public void lastnamn_txt_successfully_read(){
        int expectedSize = 100;
        List<String> result = testObject.lastName();
        Assert.assertEquals(expectedSize, result.size());
    }

    @Test
    public void get_Random_Male_Name(){
        String result = testObject.getRandomMaleName();
        Assert.assertNotNull( result);
    }

    @Test
    public void get_Random_Female_Name(){
        String result = testObject.getRandomFemaleName();
        Assert.assertNotNull( result);
    }

    @Test
    public void get_Random_Last_Name(){
        String result = testObject.getRandomLastName();
        Assert.assertNotNull(result);
    }

    @Test
    public void get_Multiply_random_names(){
        int testNumberOfNames = 2;
        Assert.assertNotNull(testObject.getMultiplyRandomNames(testNumberOfNames));
        Assert.assertEquals(2, testObject.getMultiplyRandomNames(testNumberOfNames).size());
    }

    @Test
    public void get_Full_Name_Male(){
        Assert.assertNotNull(testObject.getMaleFirstNameLastName());
    }

    @Test
    public void get_Full_Name_Female(){
        Assert.assertNotNull(testObject.getFemaleFirstNameLastName());


    }
}
