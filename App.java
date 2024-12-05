package michael.zoo.com;

import javax.imageio.IIOException;
import javax.swing.text.Utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


//MT 9/26/24
//App.java
//Driver for Zoo Midterm Program


public class App {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my Zoo Program\n");
        //create the animal name lists
        //call utilities to get animal name lists

        String myAnimal = " animalNames.txt";
        AnimalNameListsWrapper animalLists =
                Utilities.getAnimalNameLists(myAnimal);
        //access hyena name list
        ArrayList<String> listOfHyenaNames = animalLists.getHyenaNameList();
        //use a for-each loop to output each hyena name
        System.out.println("Hyena names: ");
        for (String hyenaName : listOfHyenaNames) {
            System.out.println(hyenaName);
        }
        ArrayList<String> listOfLionNames = animalLists.getLionNameList();
        System.out.println("\nLion Names: ");
        for (String lionName : listOfLionNames) {
            System.out.println(lionName);
        }
        ArrayList<String> listOfTigerNames = animalLists.getTigerNameList();
        System.out.println("\nTiger Names: ");
        for (String tigerName : listOfTigerNames) {
            System.out.println(tigerName);
        }
        ArrayList<String> listOfBearNames = animalLists.getBearNameList();
        System.out.println("\n Bear Names: ");
        for (String bearName : listOfBearNames) {
            System.out.println(bearName);
        }
        BufferedReader reader = null;

        String aniSex;
        String aniSpecies;

        try {
            reader = new BufferedReader(new FileReader("arrivingAnimals.txt"));
            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

                String[] arrayOfStrPartsOnComma = line.split(",");

                int elementNum = 0;
                for (String thePart : arrayOfStrPartsOnComma) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnComma is: " + thePart);
                    elementNum++;
                }
                String aniColor;
                String aniWeight;
                String aniOrigin01;
                String aniOrigin02;
                String aniAge;
                String aniID;
                String aniArrivalDate;

                aniArrivalDate = Utilities.arrivalDate();
                aniColor = arrayOfStrPartsOnComma[2];
                aniWeight = arrayOfStrPartsOnComma[3];
                aniOrigin01 = arrayOfStrPartsOnComma[4];
                aniOrigin02 = arrayOfStrPartsOnComma[5];

                System.out.println();
                String[] arrayOfStrPartsOnSpace = arrayOfStrPartsOnComma[0].split(",");
                elementNum = 0;
                for (String thePart : arrayOfStrPartsOnSpace) {
                    System.out.println("Element " + elementNum + "of arrayOfStrPartsOnSpace is: " + thePart);
                    elementNum++;
                }
                aniAge = arrayOfStrPartsOnSpace[0];

                int intAniAge = Integer.parseInt(aniAge);
                aniSex = arrayOfStrPartsOnSpace[3];
                aniSpecies = arrayOfStrPartsOnSpace[4];
                System.out.println("\n The animal's sex is " + aniSex);
                System.out.println("\n The species is " + aniSpecies);
                System.out.println("\n The color is " + aniColor);
                System.out.println("\n The weight is " + aniWeight);
                System.out.println("\n Origin01 is " + aniOrigin01);
                System.out.println("\n Origin02 is " + aniOrigin02);

                System.out.println();

                String[] arrayOfStrPartOnSpace02 = arrayOfStrPartsOnComma[1].split(" ");
                elementNum = 0;
                for (String thePart : arrayOfStrPartOnSpace02) {
                    System.out.println("Element " + elementNum + " of arrayOfStrPartsOnSpace02 is: " + thePart);
                    elementNum++;
                }
            }
            System.out.println();

            String[] arrayOfStrPartsOnSpace;
            String ageInYears = arrayOfStrPartsOnSpace[0];
            String animalBirthSeason = arrayOfStrPartOnSpace02[2];
            System.out.println("he age in years of the animal is: " + ageInYears);

            System.out.println("The season of birth of the animal is: " + animalBirthSeason);
            //create the right animal object for this arriving animal
            if (aniSpecies.equals("hyena")) {
                System.out.println("\n The animal is a hyena!");
                //Create an ID for the new hyena
                aniID = Utilities.calcAnimalID("hyena");
                System.out.println("\n animal ID is: " + aniID);

                //Get a Hyena name
                String myName;
                //Pop a name from the list of hyena names
                myName = listOfHyenaNames.removeFirst();

                System.out.println("\n My hyena's name is: " + myName);

                //Create a hyena object and attach to the hyena ArrayList
                Hyena hyena = new Hyena(aniSex,int AniAge, 99, "to be named", aniOrigin01 + aniOrigin02, aniArrivalDate);
                System.out.println("The new hyena's color is: " + hyena.getAnimalColor());
            }
        }

        catch (IIOException | FileNotFoundException e) {
            // Handle exceptions such as file not found or I/O errors
            e.printStackTrace();
            finally {
                //Close the BufferReader in the finally block to ensure it gets closed
                try {
                    if (reader != null) {
                        reader.close();
                    }
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        myAnimal.setAnimalName("my first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        Animal anotherAnimal = new Animal("Zig");
        System.out.println("The name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
        //Create a hyena with a name
        Hyena aNewHyena = new Hyena("Kamari");

        System.out.println(" The new hyena's name is: " + aNewHyena.getAnimalName());

        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);





        //this is a unit test - we are testing Animal Constructor we created

        Animal myNewAnimal = new Animal("male", 4, 70, "Zig", "Hy01", "2020-3-21", "brown spots", "from San Diego Zoo");

        //prove it
        System.out.println("\n this is the new animal!\n");
        System.out.println("\n ID is:" + myNewAnimal.getAnimalID() + "and names is" + myNewAnimal.getAnimalName() + "\n");




        }
    }
