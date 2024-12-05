package michael.zoo.com;

import java.util.Date;

public class Lion extends michael.zoo.com.Animal{

    static int numOfLions = 0;

    public Lion(String someName){
        super(someName);
        numOfLions++;
    }
    //Create a constructor that will have all the fields I want.
    public Lion(String sex, int age, int weight, String animalName, String animalID, Date animalBirthDate, String animalColor, String animalOrigin, Date animalArrivalDate){
        super(sex, age, weight, animalName,animalID, animalBirthDate, animalColor,animalOrigin, animalArrivalDate);
        numOfLions++;
    }

    public Lion(String aniSex, Object o) {

    }
}
