import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {

    int maxSlots = 20;
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
                    ob.printSummary();
                    break;
            }
        }
    }

    public void addVehicle(){
        int count = findSlot();
        if(count==-1){
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
                    break;
                case 2:
                    Van vanObject = new Van();
                    park1[count] = vanObject.addVan();
                    park1[count].slot=count;
                    park1[count].type = "Van";
                    break;
                case 3:
                    Motorbike motorbikeObject = new Motorbike();
                    park1[count] = motorbikeObject.addVehicle();
                    park1[count].slot=count;
                    park1[count].type = "Bike";
                    break;
            }
            System.out.println("Successfully inserted.");
        }
    }

    public void deleteVehicle(){
        displaySlots();
        System.out.print("Enter slot no to remove the vehicle : ");
        int delSlot = input.nextInt();
        park1[delSlot]=null;
    }

    public void printSummary(){
        Car ob = new Car();
        ob.displayCars(park1,maxSlots);
    }

    public int printMenu(){
        System.out.println("\n------Westminister Car Park Manager------");
        System.out.println("(1) Add Vehicle ");
        System.out.println("(2) Delete vehicle ");
        System.out.println("(3) View Summary ");
        System.out.println("(4) Exit ");
        System.out.print("Select your choice : ");
        int x = input.nextInt();
        return x;
    }

    public void displaySlots(){
        int count = countVehicles();
        if(count==0){
            System.out.println("\t_________________");
            System.out.println("\t| Park is empty |");
            System.out.println("\t-----------------");
        }else {
            System.out.println("\tSlot\t\t\tRegistration ID \t\tType \t\t\tBrand");
            for (int x = 0; x < maxSlots; x++) {
                if(park1[x] != null) {
                    System.out.println("\t " + park1[x].slot + "\t\t\t\t\t" + park1[x].id + "\t\t\t " + park1[x].type + "\t\t\t" + park1[x].brand);
                }
            }
        }
    }

    public int findSlot(){
        int x=-1;
        for(int y=0;y<maxSlots;y++){
            if(park1[y]==null){
                x=y;
                break;
            }
        }
        return x;
    }
    public int countVehicles(){
        int x=0;
        for(int y=0;y<maxSlots;y++){
            if(park1[y]!=null){
                x++;
            }
        }
        return x;
    }

}
