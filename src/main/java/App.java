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
                    int preCoupon = userEvent.getEventCost();
                    System.out.println("Here is what you selected:");
                    System.out.println("----------------------");
                    System.out.println("Guest size: " + userEvent.getGuests());
                    System.out.println("Food option: " + userEvent.getFood());
                    System.out.println("Beverage option: " + userEvent.getDrinks());
                    System.out.println("Entertainment: " + userEvent.getEntertainment());
                    System.out.println("Total cost: $" + preCoupon);
                    System.out.println("----------------------");

                        if (userGuestNumber > 100) {
                            System.out.println("Your guest list is over 100! You qualify for a coupon. Please type 'big group' to receive $200 off your total!");
                            String couponInput = bufferedReader.readLine();
                        } else {

                        }

                        if (userFood.equals("dinner") && userDrinks.equals("full bar")) {
                                System.out.println("Your food and drink selection makes you eligible for a discount. Please type 'full course' to receive $100 off your total!");
                                String couponInputTwo = bufferedReader.readLine();
                            } else {

                        }

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
