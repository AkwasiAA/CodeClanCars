package vehicles;

import components.Engine;
import components.Gearbox;
import components.Tyres;

public class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Tyres tyres;
    private Gearbox gearbox;
    private VehicleTypes vehicleTypes;

    public Vehicle(double price, String colour, VehicleTypes vehicleTypes) {
        this.price = price;
        this.colour = colour;
        this.engine = new Engine();
        this.tyres = new Tyres();
        this.gearbox = new Gearbox();
        this.vehicleTypes = vehicleTypes;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public VehicleTypes getVehicleTypes() {
        return vehicleTypes;
    }
}
