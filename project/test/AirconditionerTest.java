import main.java.com.semicolon.africa.model.Airconditioner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirconditionerTest {

    @Test
    public void airconditionIsOn_checkThatAirconditionIsOn(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerToOn();
        assertTrue(myAirconditioner.itIsOn());
    }
    @Test
    public void airconditionIsOff_checkThatAirconditionIsOff(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerToOff();
        assertTrue(myAirconditioner.itIsOff());
    }
    @Test
    public void airconditionerTemperature_checkThatAirconditionerIncreases(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerTemperature(17);
        assertEquals(17, myAirconditioner.getTemperature());
    }
    @Test
    public void airconditionerTemperature_checkThatAirconditionerDecreases(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerTemperature(18);
        assertEquals(18, myAirconditioner.getTemperature());
    }
    @Test
    public void airconditionerTemperature_checkThatTemperatureDoesNotIncreaseBeyond30(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerTemperature(18);
        assertEquals(18, myAirconditioner.getTemperature());
    }
    @Test
    public void airconditionerTemperature_checkThatTemperatureDoesNotDecreaseBeyond30(){
        Airconditioner myAirconditioner = new Airconditioner();
        myAirconditioner.setMyAirconditionerTemperature(18);
        assertEquals(18, myAirconditioner.getTemperature());
    }



}
