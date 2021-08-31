import vehicles.Vehicle;
import vehicles.VehicleTypes;

import java.util.ArrayList;

public class Customer {

    double money;
    ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }

    public int getOwnedVehicleSize(){
        return ownedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.ownedVehicles.add(vehicle);
    }
}
