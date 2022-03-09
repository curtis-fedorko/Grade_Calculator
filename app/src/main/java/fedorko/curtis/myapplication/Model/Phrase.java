package fedorko.curtis.myapplication.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Phrase {
    public int needed;
    public ArrayList<String> Bad = new ArrayList<>();
    public ArrayList<String> Good = new ArrayList<>();;
    public ArrayList<String> Unrealistic = new ArrayList<>();;
    public ArrayList<String> decent = new ArrayList<>();;

    public Phrase(){
        this.Good.add("Id focus on other things");
        this.Good.add("Break starts now");
        this.Good.add("Your Hard work payed off");
        this.Bad.add("When does the library close?");
        this.Bad.add("Your a** is Grass");
        this.Good.add("Time for a beverage");
        this.Bad.add("Uh oh");
        this.Bad.add("When does the library close?");
        this.Bad.add("Pray.");
        this.Bad.add("Not even luck could help you");
        this.Bad.add("I hope you're religous");
        this.decent.add("Don't Give up, you can do it");
    }
    public String generatePhrase(double grade){
        String outy = "";
        if(grade <= 75.0){
            outy = getGood();
        }
        else if(grade <= 96.0){
            outy = getDecent();
        }
        else{
            outy = getBad();
        }

return outy;
    }

    private String getBad() {
        Random rand = new Random();
        return this.Bad.get(rand.nextInt(Bad.size()));
    }

    private String getDecent() {
        Random rand = new Random();
        return this.decent.get(rand.nextInt(decent.size()));
    }

    private String getGood() {
        Random rand = new Random();
        return this.Good.get(rand.nextInt(Good.size()));
    }
}
