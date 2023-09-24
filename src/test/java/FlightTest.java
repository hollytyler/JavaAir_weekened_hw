import com.codeclan.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;


public class FlightTest {
    Flight flight;
    Pilot pilot;
    Plane plane;


    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747, 280, 5000.00);
        pilot = new Pilot("Jerry", CrewRank.CAPTAIN, "7855Pl", plane);
        flight = new Flight(pilot, new ArrayList<>(), plane, "GT773", "LAX", "LHR", "11:15AM");
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(plane.getCapacity(), flight.availableSeats());

        Passenger passenger = new Passenger("Jamie", 1);
        flight.bookPassenger(passenger);
        assertEquals(plane.getCapacity() -1, flight.availableSeats());
    }
}
