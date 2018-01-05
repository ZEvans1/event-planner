package models;

public class Event {
    private int guests;
    private String food;
    private String beverages;
    private String entertainment;

    public Event(int guests, String food, String beverages, String entertainment) {
        this.guests = guests;
        this.food = food;
        this.beverages = beverages;
        this.entertainment = entertainment;

    }

    public int getGuests() {
        return this.guests;
    }

    public String getFood() {
        return this.food;
    }
}


