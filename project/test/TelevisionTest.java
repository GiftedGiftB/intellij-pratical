import main.Television;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class TelevisionTest {

    @Test
    public void testThatTelevisionCanOn_isOn(){
        Television myTelevision = new Television();
        myTelevision.toggle();
        assertFalse(myTelevision.isOn());
    }
}

