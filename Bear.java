package michael.zoo.com;

import java.util.Date;

public class Bear extends michael.zoo.com.Animal{

    static int numOfBears = 0;

    public Bear(String someName){
        super(someName);
        numOfBears++;
    }
    //Create a constructor that will have all the fields I want.
    public Bear(String sex, int age, int weight, String animalName, String animalID, Date animalBirthDate, String animalColor, String animalOrigin, Date animalArrivalDate){
        super(sex, age, weight, animalName,animalID, animalBirthDate, animalColor,animalOrigin, animalArrivalDate);
        numOfBears++;
    }

    public Bear(String aniSex, Object o) {

    }
}
