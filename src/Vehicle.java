import java.util.Scanner;

public abstract class Vehicle {
    Scanner input = new Scanner(System.in);

    public ParkingSlots addVehicle(){
        ParkingSlots slot = new ParkingSlots();
        System.out.print("Enter the registration ID : ");
        slot.id = input.nextLine();
        System.out.print("Enter the brand of the vehicle : ");
        slot.brand = input.nextLine();
        return slot;
    }
}
