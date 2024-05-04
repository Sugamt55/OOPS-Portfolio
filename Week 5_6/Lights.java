package Week5_6;

public class Lights {
    public static void main(String[] args) {
        // Instantiate some Bulb objects
        Bulb bulb1 = new Bulb();
        Bulb bulb2 = new Bulb();
        Bulb bulb3 = new Bulb();

        // Turn on some bulbs
        bulb1.turnOn();
        bulb3.turnOn();

        // Check if bulbs are on and print the result
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
        System.out.println("Bulb 2 is on: " + bulb2.isOn());
        System.out.println("Bulb 3 is on: " + bulb3.isOn());

        // Turn off a bulb
        bulb1.turnOff();

        // Check if bulb 1 is off
        System.out.println("Bulb 1 is on: " + bulb1.isOn());
    }
}
