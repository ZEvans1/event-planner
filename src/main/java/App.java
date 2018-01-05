import models.Event;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to our event scheduler. Type 'start' to begin registering your event. Type 'end' at any time to cancel registration.");

        while(running) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            try {
                String programChoice = bufferedReader.readLine();

                if (programChoice.equals("start")) {
                    System.out.println("How many people will be attending your event?");
                    int userGuestNumber = Integer.parseInt(bufferedReader.readLine());
                    System.out.println("Would you like us to provide food? (Please type: 'dinner' , 'snacks' , or 'no food)");
                    String userFood = bufferedReader.readLine();
                    System.out.println("What type of beverages would you like for the event? (Please type: 'full bar' , 'beer and wine' , or 'no drinks')");
                    String userDrinks = bufferedReader.readLine();
                    System.out.println("We offer entertainment as well. (Please type: 'full band' , 'DJ' , or 'none')");
                    String userEntertainment = bufferedReader.readLine();
                    Event userEvent = new Event(userGuestNumber, userFood, userDrinks, userEntertainment);
                    System.out.println("Here is what you selected:");
                    System.out.println("----------------------");
                    System.out.println("Guest size: " + userEvent.getGuests());
                    System.out.println("Food option: " + userEvent.getFood());
                    System.out.println("Beverage option: " + userEvent.getDrinks());
                    System.out.println("Entertainment: " + userEvent.getEntertainment());


                } else if (programChoice.equals("end")) {
                    running = false;
                } else {
                    System.out.println("Input not recognized.");
                }


            }

            catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
