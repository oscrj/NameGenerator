package se.ecutb.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static se.ecutb.Model.RandomNumber.randomNumber;

public class NameService {

    static Scanner SCAN = new Scanner(System.in);

    //Method to add name from file to ArrayList:
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

    //Method to get multiple names. Randomly picked male and female names.
    public List<String> getMultiplyRandomNames(int numberOfName){
        List<String> nameList = new ArrayList<>();
        for(int i = 0; i < numberOfName; i++){
            int gender = randomNumber(2);
            if(gender == 0){
               nameList.add(getRandomMaleName()) ;
            }
            else{
                nameList.add(getRandomFemaleName());
            }
        }
        return nameList;
    }

    public String getMaleFirstNameLastName(){
        return getRandomMaleName().trim() + " " +  getRandomLastName().trim();
    }

     public String getFemaleFirstNameLastName(){
        return getRandomFemaleName().trim() + " " + getRandomLastName().trim();
     }

    public String getRandomMaleOrFemaleFirstLastName(int gender) {

        if(gender > 1){
        gender = randomNumber(2);
        }
        if(gender == 0){
            return getRandomMaleName().trim() + " " + getRandomLastName().trim();
        }
        else{
            return getRandomFemaleName().trim() + " " + getRandomLastName().trim();
        }
    }

    //Method to generate by amount of names combined with same lastname.
    public List<String> getMaleNameWithSameLastName(String lastName, int numberOfNames){
        List<String> nameList = new ArrayList<>();
        for(int i = 0; i < numberOfNames; i++){
            nameList.add(getRandomMaleName().trim() + " " + lastName);
        }
        return nameList;
    }
    public List<String> getFemaleNameWithSameLastName(String lastName, int numberOfNames){
        List<String> nameList = new ArrayList<>();
        for(int i = 0; i < numberOfNames; i++){
            nameList.add(getRandomFemaleName().trim() + " " + lastName);
        }
        return nameList;
    }

    //Method to get a name by First letter in name.
    public String getMaleNameByFirstLetter(char letter){
        List<String> nameList = new ArrayList<>();
        for(String name : maleFirstName()) {
            if (name.charAt(0) == letter){
                nameList.add(name);
            }
        }
        return nameList.get(randomNumber(nameList.size()));
    }
    public String getFemaleNameByFirstLetter(char letter){
        List<String> nameList = new ArrayList<>();
        for(String name : femaleFirstName()) {
            if (name.charAt(0) == letter){
                nameList.add(name);
            }
        }
        return nameList.get(randomNumber(nameList.size()));
    }

    public String getLastNameByFirstLetter(char letter){
        List<String> nameList = new ArrayList<>();
        for(String name : lastName()){
            if(name.charAt(0) == letter){
                nameList.add(name);
            }
        }
        return nameList.get(randomNumber(nameList.size()));
    }


    public int getValidInt() {
        boolean valid = false;
        int number = 0;
        while (!valid) {
            try {
                number = Integer.parseInt(getString());
                valid = true;
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a number.");
                return number;
            }
        }
        return number;
    }

    public static String getString(){
        return SCAN.nextLine();
    }

}
