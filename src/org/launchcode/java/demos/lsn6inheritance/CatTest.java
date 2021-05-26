package org.launchcode.java.demos.lsn6inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;



public class CatTest {
    Cat kitty;
    @Before
    public void createCatObject() {
        kitty = new Cat();
    }
    @Test
    public void inheritsDefaultCatInSecondConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertEquals(13, keyboardCat.getWeight(), .001);
    }
    @Test
    public void isNotInitiallyTired() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat");
        assertFalse(keyboardCat.isHungry());
        assertFalse(keyboardCat.isTired());
        //assertTrue(keyboardCat.isHungry());
        keyboardCat.eat();

    }
}


