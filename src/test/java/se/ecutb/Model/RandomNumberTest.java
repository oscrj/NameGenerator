package se.ecutb.Model;

import org.junit.Assert;
import org.junit.Test;

public class RandomNumberTest {

    @Test
    public void test_Random_Number(){
        int expected = 0;
        int result = RandomNumber.randomNumber(1);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void test_Random_Number_test2(){
        int result = RandomNumber.randomNumber(5);
        Assert.assertTrue(result >= 0 && result <= 4);
    }
}
