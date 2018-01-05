package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    private int guests;
    private String food;
    private String drinks;
    private String entertainment;
    private Map<String, Integer> choiceValues;

    public Event(int guests, String food, String drinks, String entertainment) {
        this.guests = guests;
        this.food = food;
        this.drinks = drinks;
        this.entertainment = entertainment;
        choiceValues = new HashMap<>();
        choiceValues.put("dinner", 50);
        choiceValues.put("snacks", 20);
        choiceValues.put("no food", 0);
        choiceValues.put("full bar", 50);
        choiceValues.put("beer and wine", 20);
        choiceValues.put("no drinks", 0);
        choiceValues.put("live band", 50);
        choiceValues.put("DJ", 20);
        choiceValues.put("no entertainment", 0);


    }

    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getDrinks() {
        return this.drinks;
    }

    public String getEntertainment() {
        return this.entertainment;
    }

    public int getEventCost() {
        return 0;
    }
}


