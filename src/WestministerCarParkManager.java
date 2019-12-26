import java.util.Scanner;

public class WestministerCarParkManager implements CarParkManager {

    public static void main(String args[]){

    }

    public void addVehicle(){

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
        System.out.print("Select your choice :");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        return x;
    }

}
