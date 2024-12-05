package michael.zoo.com;
import java.util.Date;

public class Animal {

 public static int numOfAnimals = 0;
 //Create Static int that keep track of the number of animals created

    //create a constructor for our new Animal objects
    public Animal(){numOfAnimals++;}

    //create a constructor that accepts a name
 public Animal(String aName){
     this.animalName = aName;
 }

    public Animal(String sex, int age,int weight,String animalID,String animalName,Date animalBirthdate,String animalColor,String animalOrigin,Date animalArrivalDate) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalID = animalID;
        this.animalName = animalName;
        this.animalBirthdate = animalBirthdate;
        this.animalColor = animalColor;
        this.animalOrigin = animalOrigin;
        this.animalArrivalDate = animalArrivalDate;

   }

    //CREATE ALL ATTRIBUTES(fields)


    // sex will be 'male' and 'female'
    private String sex ="";
    // age will be in years
    private int age = 0;
    //weight will be in pounds
    private int weight = 0;
    //create a unique ID for each animal
    private String animalID = "";
    //animal names come from a text file called animalName
    private String animalName = "";
    //animal birthdate
    public Date animalBirthdate;
    //animal color
    private String animalColor = "";
    //zoo origin
    private String animalOrigin = "";
    //arrival date
    private Date animalArrivalDate;



    //Create getters and setters
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public int getWeight() { return weight;}
    public void setWeight(int weight) { this.weight = weight; }

    public String getAnimalID() { return animalID; }
    public void setAnimalID(String animalID) { this.animalID = animalID;}

    public String getAnimalName() {return animalName;}
    public void setAnimalName(String animalName) {this.animalName = animalName;}

    public Date getAnimalBirthdate() {return animalBirthdate;}
    public void setAnimalBirthdate(Date animalBirthdate) {this.animalBirthdate = animalBirthdate;}

    public String getAnimalColor() {return animalColor;}
    public void setAnimalColor(String animalColor) {this.animalColor = animalColor;}

    public String getAnimalOrigin() {return animalOrigin;}
    public void setAnimalOrigin(String animalOrigin) {this.animalOrigin = animalOrigin;}

    public Date getAnimalArrivalDate() {return animalArrivalDate;}
    public void setAnimalArrivalDate(Date animalArrivalDate) {this.animalArrivalDate = animalArrivalDate;}

 public int getNumOfAnimals() {return numOfAnimals;}
 public void setNumOfAnimals(int numOfAnimals) {
     Animal.numOfAnimals = numOfAnimals;}
}
