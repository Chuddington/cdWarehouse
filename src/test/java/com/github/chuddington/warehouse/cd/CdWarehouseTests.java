package com.github.chuddington.warehouse.cd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CdWarehouseTests {

    // 1: Write assertions
    // 2: Write variables
    // 3: Test should fail
    // 4: Solve compiler issues
    // 5: Fill in the functionality
    // 6: Test should pass

    /*
     * TODO: CD Stock Levels can be retrieved
     * TODO: Add CD Stock to the Warehouse
     * TODO:
     */

    @Test
    void testSomething() {
        assertTrue(true);
    }

    @Test
    void should_get_stock_count() {
        Product product = new Product();
        assertEquals(10, product.getStock(123));
    }
}
