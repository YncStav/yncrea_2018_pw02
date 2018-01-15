package yncrea.pw02.beans.impl;

import yncrea.pw02.beans.Customer;
import yncrea.pw02.beans.Shop;
import yncrea.pw02.pojo.Order;

public class Person implements Customer {
    private Shop favouriteShop;

    public Shop getFavouriteShop() {
        return favouriteShop;
    }

    public void setFavouriteShop(Shop favouriteShop) {
        this.favouriteShop = favouriteShop;
    }

    @Override
    public void sendOrder(Order myOrder){
        this.favouriteShop.updateStocks(myOrder);
    }
}
