import com.codeclan.Passenger;
import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jerry", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("Jerry", passenger.getName());
    }
}
