import org.junit.Before;
import org.junit.Test;
import vehicles.Vehicle;
import vehicles.VehicleTypes;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Vehicle vehicle;

    @Before
    public void before(){
        customer = new Customer(40000);
    }

    @Test
    public void hasMoney(){
        assertEquals(40000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasCollectionOfOwnedVehicles(){
        assertEquals(0, customer.getOwnedVehicleSize());
    }

    @Test
    public void canAddToCollection(){
        vehicle = new Vehicle(20000, "White", VehicleTypes.CAR);
        customer.addVehicle(vehicle);
        assertEquals(1, customer.getOwnedVehicleSize());
    }
}
