import org.junit.Before;
import org.junit.Test;
import vehicles.Vehicle;
import vehicles.VehicleTypes;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Vehicle vehicle;

    @Before
    public void before(){
        dealership = new Dealership(20000);
    }

    @Test
    public void hasTill(){
        assertEquals(20000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasCollectionOfVehicles(){
        assertEquals(0, dealership.getNumberOfVehicles());
    }

    @Test
    public void canAddToCollection(){
        vehicle = new Vehicle(35000, "Blue", VehicleTypes.ELECTRICCAR);
        dealership.addVehicle(vehicle);
        assertEquals(1, dealership.getNumberOfVehicles());
    }
}
