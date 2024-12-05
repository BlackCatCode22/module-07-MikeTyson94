package michael.zoo.com;

import java.util.Date;

public class Tiger extends michael.zoo.com.Animal{

    static int numOfTigers = 0;

    public Tiger(String someName){
        super(someName);
        numOfTigers++;
    }
    //Create a constructor that will have all the fields I want.
    public Tiger(String sex, int age, int weight, String animalName, String animalID, Date animalBirthDate, String animalColor, String animalOrigin, Date animalArrivalDate){
        super(sex, age, weight, animalName,animalID, animalBirthDate, animalColor,animalOrigin, animalArrivalDate);
        numOfTigers++;
    }

    public Tiger (String aniSex, Object o) {

    }
}
