package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_car;
    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    public void testConstructor(){
            assertEquals( "Toyota", test_car.getMake());
            assertEquals("Prius", test_car.getModel());
            assertEquals(10, test_car.getGasTankSize(), .001);
            assertEquals(10, test_car.getGasTankLevel(), .001);
            assertEquals(50, test_car.getMilesPerGallon(), 0);
        }


    //TODO: gasTankLevel is accurate after driving within tank range
      @Test
      public void testGasTankAfterDriving() {
          assertTrue(test_car.getGasTankLevel() == 10);
          test_car.drive(50);
          assertEquals(9, test_car.getGasTankLevel(), .001);
      }
        //TODO: gasTankLevel is accurate after attempting to drive past tank range
        @Test
        public void testGasTankAfterDrivingPastRange() {
        test_car.drive(400);
        System.out.println(test_car.getGasTankLevel());
        //assertTrue(test_car.getGasTankLevel() == 10);
    }
        //TODO: can't have more gas than tank size, expect an exception
        @Test (expected = IllegalArgumentException.class)
        public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");

    }
}

