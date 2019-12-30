import java.util.Scanner;

public class Car extends Vehicle {
    
    public ParkingSlots addCar(){
        ParkingSlots slot = new ParkingSlots();
        slot=super.addVehicle();
        System.out.print("Enter the number of doors : ");
        slot.noOfDoors = input.nextInt();
        System.out.print("Enter the color of the car : ");
        slot.color = input.next();
        return slot;
    }
}
