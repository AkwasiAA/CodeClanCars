import org.junit.Before;
import org.junit.Test;
import vehicles.Vehicle;
import vehicles.VehicleTypes;

import static org.junit.Assert.assertEquals;

public class VehicleTest {


    Vehicle vehicle;
    String colour;
    double price;

    @Before
    public void before(){
        vehicle = new Vehicle(20000, "Black", VehicleTypes.HYBRIDCAR);
    }

    @Test
    public void canGetPrice(){
        assertEquals(20000, vehicle.getPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("Black",vehicle.getColour());
    }

    @Test
    public void canGetVehicleTypes(){
        assertEquals(VehicleTypes.HYBRIDCAR, vehicle.getVehicleTypes());
    }

}