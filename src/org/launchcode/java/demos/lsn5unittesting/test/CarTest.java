package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    Car test_car;

    @Test
    public void testInitialGasTank() {
        test_car = new Car("Toyota", "Prius", 10, 50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10,50);
        assertTrue(test_car.getGasTankLevel() == 10);
        //TODO: gasTankLevel is accurate after attempting to drive past tank range
//        @Before
//        public void createCarObject() {
            //test_car = new Car("Toyota", "Prius", 10,50);
            //assertTrue(test_car.getGasTankLevel() == 10);
        //TODO: can't have more gas than tank size, expect an exception

    }
}

