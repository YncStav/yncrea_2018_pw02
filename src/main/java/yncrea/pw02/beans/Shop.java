package yncrea.pw02.beans;

import yncrea.pw02.pojo.Order;

import java.util.Map;

public interface Shop {
    Map<String, Integer> getStock();
    void setStock(Map<String, Integer> newStock);
    void updateStocks(Order myOrder);

}
