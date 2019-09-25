package se.ecutb.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import static se.ecutb.Model.RandomNumber.randomNumber;

public class NameService {

    public List<String> maleFirstName(){

        List<String> maleNames = new ArrayList<>();
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("src/Pojknamn.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                maleNames.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return maleNames;
    }

    public List<String> femaleFirstName(){

        List<String> femaleNames = new ArrayList<>();
        String line;
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("src/Flicknamn.txt"))){
            while((line = reader.readLine()) != null){
                femaleNames.add(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return femaleNames;
    }

    public List<String> lastName(){

        List<String> lastNames = new ArrayList<>();
        String line;
        try(BufferedReader reader = Files.newBufferedReader(Paths.get("src/Efternamn.txt"))){
            while((line = reader.readLine()) != null){
                lastNames.add(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return lastNames;
    }

    //Method to get a random Name using random number.
    public String getRandomMaleName(){
        return maleFirstName().get((randomNumber(maleFirstName().size())));
    }

    public String getRandomFemaleName(){

        return femaleFirstName().get((randomNumber(femaleFirstName().size())));
    }

    public String getRandomLastName(){

        return lastName().get(randomNumber(lastName().size()));
    }
}
