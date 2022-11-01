package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("The soon to be king of the jungle. (Please enter your lion cub's name)");
        String lionName = input.nextLine();


        VirtualPet lion = new VirtualPet(lionName);
        System.out.println("Hi " + lion.getLionName() + "! We're gonna have some fun!");

        //instructions
        background(lionName);

        int select;


        do {
            System.out.println("What do you want to do?");
            System.out.println("[0] Feed " + lionName + " some delicious meats and veggies.");
            System.out.println("[1] Give " + lionName + " some fresh water.");
            System.out.println("[2] Take " + lionName + " outside to poop.");
            System.out.println("[3] Take " + lionName + " to the veterinarian.");
            System.out.println("[4] Play with " + lionName + ".");
            System.out.println("[5] Quit.");

            select = input.nextInt();


            if (select == 5) {
                continue;
            }
            else if (select == 0) {
                if (lion.getHunger()  >5){
                    System.out.println("Woah," + lionName + " looks really full. Lets take it outside to poop.");
                    showLionStats(lion);
                    continue;
                }
                System.out.println(lionName + " really enjoyed the treat. ");

                lion.changeThirst(-1);
                lion.changeWaste(-1);
                lion.changeSickness(-1);
                showLionStats(lion);

            }
            else if (select ==1){
                if (lion.getThirst()  > 5){
                    System.out.println("Woah, " + lionName + " doesn't really look thirsty. Lets go play with him.");
                    showLionStats(lion);
                    continue;
                }
                System.out.println(lionName +  " enjoyed the drink of water.");

                lion.changeWaste(-1);
                lion.changeThirst(+1);
                lion.changeSickness(-2);
                showLionStats(lion);

            }
            else if (select ==2){
                if (lion.getWaste() > 5){
                    System.out.println("That's odd, " + lionName + " looks like he doesn't want to poop, lets give him some water to drink.");
                    showLionStats(lion);
                    continue;
                }
                System.out.println(lionName + " really wanted to poop.");

                lion.changeBoredom(-1);
                lion.changeThirst(-1);
                lion.changeHunger(-2);
                showLionStats(lion);

            }
            else if (select ==3){
                if(lion.getBoredom()  > 5){
                    System.out.println("Tired huh! " + lionName + " Looks tired and is hurting a little. Lets take him in to the Veterinarian.");
                    showLionStats(lion);
                    continue;
                }
                System.out.println(lionName + " Loved playing with you.");
                lion.changeBoredom(-1);
                lion.changeHunger(-1);
                lion.changeThirst(-1);
                showLionStats(lion);

            }
            else if (select ==4){
                if(lion.getSickness()  > 5){
                    System.out.println(lionName + " seems healthy and ready to eat, we should feed him.");
                    showLionStats(lion);
                    continue;
                }
                System.out.println(lionName + " is enjoying being at the veterinary.");

                lion.changeHunger(-1);
                lion.changeThirst(-1);
                lion.changeSickness(+1);
                showLionStats(lion);

            }
            else{
                System.out.println("Please choose an activity to do with " + lionName + " in order to start taking care of him.");
            }

            lion.tick();
        }while (select != 5); //5 = Quit.




    }
    //Show current stats of lion cub
    private static void showLionStats(VirtualPet lion){

        System.out.println("Hunger: " + lion.getHunger());
        System.out.println("Thirst: " + lion.getThirst());
        System.out.println("Waste: " + lion.getWaste());
        System.out.println("Boredom: " + lion.getBoredom());
        System.out.println("Sickness: " + lion.getSickness());
    }

    private static void background(String lionName) {
        System.out.println(
                        "The soon to be King " + lionName + " was kidnapped by poachers in africa away from its parents and kins."
                        + "\nWe must play with him to keep him from boredom or homesickness"
                        + "\nwe must take care of his health to prevent all types of sicknesses."
                        + "\nWe also need to feed him food to prevent hunger and for growing the lion cub every once in a while. "
                        + "\n---------------------------------------------------------------------------------------------");
    }

}
