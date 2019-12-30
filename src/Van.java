public class Van extends Vehicle {
    int cargoVolume;

    public ParkingSlots addVan(){
        ParkingSlots slot = new ParkingSlots();
        slot=super.addVehicle();
        System.out.print("Enter the cargoVolume : ");
        slot.cargoVolume = input.nextInt();
        return slot;
    }
}