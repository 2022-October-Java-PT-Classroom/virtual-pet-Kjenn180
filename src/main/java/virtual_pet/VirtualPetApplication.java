package virtual_pet;

import java.util.Random;
import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("The soon to be king of the jungle. (Please enter your lion cub's name)");
        String lionName = input.nextLine();


        VirtualPet lion = new VirtualPet(lionName);
        System.out.println("Hi " + lion.getLionName() + "! We're gonna have some fun");

        //instructions
        background(lionName);

        int select;

        select = input.nextInt();

        do {
            System.out.println("What do you want to do?");
            System.out.println("[0] Feed " + lionName + "some delicious meats and veggies.");
            System.out.println("[1] Give " + lionName + "some fresh water.");
            System.out.println("[3] Take " + lionName + "outside to poop.");
            System.out.println("[4] Take " + lionName + "to the veterinarian.");
            System.out.println("[5] Play with " + lionName + ".");
            System.out.println("[6] Quit.");


            if (select == 6) {
                continue;
            }
            else if (select == 0) {
                if (lion.getHunger() < 5) {
                    System.out.println("Woah," + lionName + "looks really full. Lets take it outside to poop.");
                    continue;
                }
                System.out.println(lionName + "really wanted to potty!");

                lion.changeThirst(-1);
                lion.changeWaste(-1);
                lion.changeBoredom(+1);
                lion.changeSickness(-1);

            }
            else if (select ==1){
                if (lion.getThirst() >5){
                    System.out.println("Woah, " + lionName + "doesn't really look thirsty. Lets go play with him.");
                    continue;
                }
                System.out.println(lionName + "really enjoyed playing.");

                lion.changeThirst(+1);
                lion.changeWaste(+1);
                lion.changeSickness(+1);
                lion.changeBoredom(-1);


            }


            lion.tick();



        }while (select != 6);




    }

    private static void background(String lionName) {
        System.out.println(
                "The soon to be king" + lionName + " was kidnapped by poachers in africa away from its parents and kins."
                        + "\nWe must play with him to keep boredom or homesickness"
                        + "\nwe must take care of his health to prevent all types of sicknesses."
                        + "\nWe also need to feed him food to for his hunger as a growing lion cub every once in a while ");
    }

}
