package com.github.chuddington.warehouse.cd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CdWarehouseTests {

    // 1: Write assertions
    // 2: Write variables
    // 3: Test should fail
    // 4: Solve compiler issues
    // 5: Fill in the functionality
    // 6: Test should pass

    /*
     * DONE: CD Stock Levels can be retrieved
     * DONE: Add CD Stock to the Warehouse
     */

    private final WarehouseProduct productOneTwoThree = new WarehouseProduct(123);
    private final Warehouse warehouse = new Warehouse();

    @BeforeEach
    void setUp() {
        warehouse.addProduct(productOneTwoThree, 10);
    }

    @Test
    void testSomething() {
        assertTrue(true);
    }

    @Test
    void warehouseHasState() {
        assertEquals(10, warehouse.getStock(productOneTwoThree));
    }
}
