import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {

    int count =0;
    ParkingSlots[] park1 = new ParkingSlots[20];
    Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        WestministerCarParkManager ob = new WestministerCarParkManager();
        int x=0;
        while(x!=4){
            x = ob.printMenu();
            switch (x){
                case 1:
                    ob.addVehicle();
                    break;
                case 2:
                    ob.deleteVehicle();
                    break;
                case 3:
                    ob.displaySlots();
                    break;
            }
        }
    }

    public void addVehicle(){
        if(count>=20){
            System.out.println("Cannot insert a new vehicle.");
        }else{
            System.out.print("Select vehicle type : car-type1 van-type2 motorbike-type3\ntype: ");
            int x = input.nextInt();

            switch(x){
                case 1:
                    Car carObject = new Car();
                    park1[count]=carObject.addCar();
                    park1[count].slot=count;
                    park1[count].type = "Car";
                    count++;
                    break;
                case 2:
                    Van vanObject = new Van();
                    park1[count] = vanObject.addVan();
                    park1[count].slot=count;
                    park1[count].type = "Van";
                    count++;
                    break;
                case 3:
                    Motorbike motorbikeObject = new Motorbike();
                    park1[count] = motorbikeObject.addVehicle();
                    park1[count].slot=count;
                    park1[count].type = "Bike";
                    count++;
                    break;
            }
            System.out.println("Successfully inserted.");
        }
    }

    public void deleteVehicle(){

    }

    public void printSummary(){

    }

    public int printMenu(){
        System.out.println("------Westminister Car Park Manager------");
        System.out.println("(1) Add Vehicle ");
        System.out.println("(2) Delete vehicle ");
        System.out.println("(3) View Summary ");
        System.out.println("(4) Exit ");
        System.out.print("Select your choice : ");
        int x = input.nextInt();
        return x;
    }

    public void displaySlots(){
        if(count==0){
            System.out.println("Park is empty");
        }else {
            System.out.println("\tSlot\t\t\tRegistration ID \t\tType ");
            for (int x = 0; x < count; x++) {
                System.out.println("\t " + park1[x].slot + "\t\t\t\t\t" + park1[x].id + "\t\t\t " + park1[x].type);
            }
        }
    }

}
