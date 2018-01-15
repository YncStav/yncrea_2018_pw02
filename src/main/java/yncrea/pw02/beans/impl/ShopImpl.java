package yncrea.pw02.beans.impl;

import yncrea.pw02.beans.Shop;
import yncrea.pw02.pojo.Order;

import java.util.Map;

public class ShopImpl implements Shop {
    private Map<String, Integer> stock;

    @Override
    public Map<String, Integer> getStock() {
        return this.stock;
    }

    @Override
    public void setStock(Map<String, Integer> newStock) {
        this.stock = newStock;
    }

    @Override
    public void updateStocks(Order myOrder) {
        for (String product: myOrder.getProducts()) {
            this.stock.put(product, this.stock.get(product)-1);
        }
    }
}
