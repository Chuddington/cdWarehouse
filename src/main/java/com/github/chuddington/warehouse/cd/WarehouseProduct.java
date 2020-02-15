package com.github.chuddington.warehouse.cd;

public class WarehouseProduct {
    private int productId;

    public WarehouseProduct(final int productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(final Object other) {
        if (other == this) {
            return true;
        }

        if (other == null || other.getClass() != this.getClass()) {
            return false;
        }

        WarehouseProduct that = (WarehouseProduct) other;

        return this.productId == that.productId;
    }
}