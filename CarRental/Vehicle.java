/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarRental;

/**
 *
 * @author nicko
 */
abstract class Vehicle {
    protected String make;
    protected String model;
    protected double rentalPrice;
    
    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }
    
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: P + rentalPrice");
    }
    
    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }
    
    public double calculateDiscountedRentalCost(int days, double discountPercentage) {
        double totalCost = calculateRentalCost(days);
        return totalCost - (totalCost * (discountPercentage / 100));
    }
    
    public abstract void performMaintenance();
}

