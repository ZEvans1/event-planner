package models;

import java.util.HashMap;
import java.util.Map;

public class Event {
    private int guests;
    private String food;
    private String drinks;
    private String entertainment;
    private Map<String, Integer> choiceValues;
    private int eventCost;

    public Event(int guests, String food, String drinks, String entertainment) {
        this.guests = guests;
        this.food = food;
        this.drinks = drinks;
        this.entertainment = entertainment;
        choiceValues = new HashMap<>();
        choiceValues.put("dinner", 200);
        choiceValues.put("snacks", 50);
        choiceValues.put("no food", 0);
        choiceValues.put("full bar", 200);
        choiceValues.put("beer and wine", 50);
        choiceValues.put("no drinks", 0);
        choiceValues.put("live band", 500);
        choiceValues.put("DJ", 100);
        choiceValues.put("none", 0);


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
        eventCost = choiceValues.get(this.food) + choiceValues.get(this.drinks) + choiceValues.get(this.entertainment);

        if (this.guests >= 100) {
            eventCost = eventCost + 500;
        } else if (this.guests < 100 && this.guests >= 50) {
            eventCost = eventCost + 300;
        } else if (this.guests < 50 && this.guests > 0) {
            eventCost = eventCost + 100;
        } else {
            eventCost = eventCost;
        }
        return eventCost;
    }
}


