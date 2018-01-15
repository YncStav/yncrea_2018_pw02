package yncrea.pw02.beans.impl;

import yncrea.pw02.beans.Customer;
import yncrea.pw02.beans.Shop;
import yncrea.pw02.pojo.Order;

public class Company implements Customer{
    private Shop favouriteShop;
    private String license;

    public String getLicense(){
        return this.license;
    }

    public Shop getFavouriteShop(){
        return this.favouriteShop;
    }

    public void setFavouriteShop(Shop favouriteShop) {
        this.favouriteShop = favouriteShop;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    @Override
    public void sendOrder(Order order) {
        order.setLicense(this.license);
        this.favouriteShop.updateStocks(order);
    }
}
