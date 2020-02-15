package com.github.chuddington.warehouse.cd;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private Map<WarehouseProduct, Integer> stockMap = new HashMap<>();

    public int getStock(final WarehouseProduct warehouseProduct) {
        return this.stockMap.get(warehouseProduct);
    }

    public void addProduct(WarehouseProduct warehouseProduct, int stockLevel) {
        this.stockMap.put(warehouseProduct, stockLevel);
    }
}