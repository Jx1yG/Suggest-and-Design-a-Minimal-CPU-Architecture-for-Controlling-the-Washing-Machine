package test;

import main.WashingMachineController1;
import org.junit.Test;

import static org.junit.Assert.*;

public class WashingMachineController1Test {

    @Test
    public void testWashingMachineController1() {
        // Test case 1: Valid input
        WashingMachineController1 controller1 = new WashingMachineController1();
        controller1.setEnergyEfficientMode(true);
        controller1.setWaterTemperature(40);
        controller1.start();

        assertFalse(controller1.isErrorDetected());
        assertEquals(WashingMachineController1.State.WATER_INTAKE, controller1.getState());


        // Test case 2: Invalid temperature input
        WashingMachineController1 controller2 = new WashingMachineController1();
        controller2.setEnergyEfficientMode(false);
        controller2.setWaterTemperature(50); // Invalid temperature
        controller2.start();

        assertTrue(controller2.isErrorDetected());
        assertEquals(WashingMachineController1.State.OFF, controller2.getState());

        // Additional test cases as needed
    }
}
