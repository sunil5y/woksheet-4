/*
 * A class for car objects, demonstrating the use of methods as behaviours
 * and variables as properties.
 * 
 * Ingo Frommholz, October 2011
 */
import java.util.Scanner;
// define a class Car
public class Car
{
    /*
     * The properties of a car
     */
    String model;  // the car model
    String color;  // the car color
    int numOfPassengers; // how many passengers are in the car?
    double amountOfGas;  // the amount of gas
    /*creating the constructor for 4 parameters for  model,colour, numOfPassenger and
    amountOfGas of object car.
    */
    public Car(String mod, String col, int pass, double gas)
    {
        model = mod;
        color = col;
        numOfPassengers = pass;
        amountOfGas = gas;
    }
    
    public Car(String mod) {
        model = mod;
        color = "blue";
    }
    
    /*
     * Initialises the values
     */
     /*now we dont need initialiser because now constructor take now both.
    /*public void initialise()
    {
        numOfPassengers = 0;
        amountOfGas = 16.5;
    }
    
    /*
     * Sets the amount of gas. This method changes the amount of gas
     * property of the object, but does not return anything.
     */
    public void setAmountOfGas(double amount) {
        amountOfGas = amount;
    }
    
    /*
     * Gets the current amount of gas. This method returns the current
     * amount of gas as a double value.
     */
    public double getAmountOfGas()
    {
        return amountOfGas;
    }
    
    /*
     * This adds a passenger to your car.
     */
    public void addPassenger() {
        numOfPassengers++;
        
        // alternatively:
        // numOfPassengers = numOfPassengers + 1;
    }
    
    /*
     * This removes a passenger from your car.
     */
    public void removePassenger() {
        numOfPassengers--;
        
        // alternatively:
        // numOfPassengers = numOfPassengers - 1;
    }
    
    /*
     * This returns the current number of passengers as an integer value. 
     */
    public int getNumOfPassengers() {
        return numOfPassengers;
    }
    
    /*
     * This returns the model of the car as a String object
     */
    public String getModel() {
        return model;
    }
    
    /*
     * This returns the colour of the car as a String object
     */
    public String getColour() {
        return color;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Car Model:");
        String model = sc.nextLine();
        System.out.print("Enter Car Color:");
        String color = sc.nextLine();
        System.out.print("Enter Number of Passenger:");
        int numOfPassengers = sc.nextInt();
        System.out.print("Enter Amount of Gas:");
        double amountOfGas = sc.nextDouble();
        sc.close();

        /*
         * Create a new Car object.
         */
        Car myCar = new Car(model, color, numOfPassengers, amountOfGas);
        //myCar.initialise();
        System.out.println("My car is a " + myCar.getModel()+ " and it is "
         + myCar.getColour() + ".");
                           
                            
        /*
         * Get and print the amount of gas
         */      
        double gasAmount = myCar.getAmountOfGas();
        System.out.println("The current amount of gas is " + gasAmount + ".");

        /*
         * Add and print a new passenger
         */
        myCar.addPassenger(); // a new passenger
        myCar.addPassenger(); // and another one
        int passengers = myCar.getNumOfPassengers();
        System.out.println("My car carries " + passengers+ " passengers right now.");
        /*
         * Refill the tank, print new value
         */                    
        myCar.setAmountOfGas(30); // fill the tank
        gasAmount = myCar.getAmountOfGas();
        System.out.print("I refilled my car! "); // note the use of print()
        System.out.println("Now the current amount of gas is "+gasAmount + ".");               
        /*
         * Remove one passenger, print updated number of
         * passengers
         */                    
        myCar.removePassenger(); // 1 passenger stepped off
        passengers = myCar.getNumOfPassengers();
        System.out.println("My car carries "+ passengers+ " passengers right now.");                    
    }
}

