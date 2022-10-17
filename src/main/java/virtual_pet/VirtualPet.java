package virtual_pet;

public class VirtualPet {

    private String lionName;
    private int hunger;
    private int thirst;
    private int waste;
    private int boredom;
    private int sickness;
    //constructor

    public VirtualPet(String l){
        this.lionName = l;
        this.hunger = 1;
        this.thirst = 1;
//        put this. for the rest of the variable
        waste = 1;
        boredom = 1;
        sickness = 1;
    }
    //change levels with utility methods
    public void changeHunger(int h){
        hunger += h;
    }

    public void changeThirst(int t){
        thirst += t;
    }

    public void changeWaste(int w){
        waste += w;
    }

    public void changeBoredom(int b){
        boredom +=b;
    }

    public void changeSickness(int s){
        sickness +=s;
    }
    //Tick method for randomizing
    public void tick(){
        hunger += 1;
        thirst += 1;
        waste += 1;
        boredom += 1;
        sickness += 1;
    }
    //getter methods
    public String getLionName() {
        return lionName;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst(){
        return thirst;
    }

    public int getWaste(){
        return waste;
    }

    public int getBoredom(){
        return boredom;
    }

    public int getSickness(){
        return sickness;
    }

    //setter methods
    public void setHunger(int hunger){
        this.hunger = hunger;
    }

    public void setThirst(int thirst){
        this.thirst = thirst;
    }

    public void setWaste(int waste){
        this.waste = waste;
    }

    public void setBoredom(int boredom){
        this.boredom = boredom;
    }

    public void setSickness(int sickness){
        this.sickness = sickness;
    }
}
