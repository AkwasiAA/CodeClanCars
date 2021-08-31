import vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    double till;
    ArrayList<Vehicle> vehiclesInStock;

    public Dealership(double till) {
        this.till = till;
        this.vehiclesInStock = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehiclesInStock.add(vehicle);
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getVehiclesInStock() {
        return vehiclesInStock;
    }

    public int getNumberOfVehicles(){
        return vehiclesInStock.size();
    }
}
