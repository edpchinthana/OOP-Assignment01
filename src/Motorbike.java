public class Motorbike extends Vehicle {
    int engineCapacity;

    public ParkingSlots addMotorbike(){
        ParkingSlots slot = new ParkingSlots();
        slot=super.addVehicle();
        System.out.print("Enter the engine capacity : ");
        slot.engineCapacity = input.nextInt();
        return slot;
    }
}
