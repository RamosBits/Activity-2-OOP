/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRental;

/**
 *
 * @author nicko
 */
public class RentalSystemTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4]; 
        
        vehicles[0] = new Car("Toyota", "Trueno AE86", 400.0, 4);
        vehicles[1] = new Truck("Honda", "Acty", 300.0, 2.5);
        vehicles[2] = new Motorcycle("Suzuki", "Raider 150", 600.0, true);
        vehicles[3] = new ElectricCar("Hatasu", "E-Bike Hero", 1000.0, 75.0);
        
        int rentalDays = 4;
        double discount = 10.0;
        
        for (Vehicle v : vehicles) {
            v.displayDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: P" + v.calculateRentalCost(rentalDays));
            System.out.println("Discounted Rental Cost: P" + v.calculateDiscountedRentalCost(rentalDays, discount));
            v.performMaintenance();
            System.out.println("-----------------------------");
        }
    }
}
