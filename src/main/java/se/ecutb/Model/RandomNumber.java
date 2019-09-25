package se.ecutb.Model;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static int randomNumber(int max){

        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
