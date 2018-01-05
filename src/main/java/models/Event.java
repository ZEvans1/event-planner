package models;

public class Event {
    private int guests;
    private String food;
    private String drinks;
    private String entertainment;

    public Event(int guests, String food, String drinks, String entertainment) {
        this.guests = guests;
        this.food = food;
        this.drinks = drinks;
        this.entertainment = entertainment;

    }

    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }

    public String getDrinks() {
        return "none";
    }
}


