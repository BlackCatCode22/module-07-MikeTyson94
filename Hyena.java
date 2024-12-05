package michael.zoo.com;

import java.util.Date;

public class Hyena extends michael.zoo.com.Animal {

    static int numOfHyenas = 0;

    public Hyena(String someName){
        super(someName);
        numOfHyenas++;

    }
    //Create a constructor that will have all the fields I want.
    public Hyena(String sex, int age, int weight, String animalName, String animalID, Date animalBirthDate, String animalColor, String animalOrigin, Date animalArrivalDate){
        super(sex, age, weight, animalName,animalID, animalBirthDate, animalColor,animalOrigin, animalArrivalDate);
        numOfHyenas++;
    }

    public Hyena(String aniSex, Object o) {

    }
}