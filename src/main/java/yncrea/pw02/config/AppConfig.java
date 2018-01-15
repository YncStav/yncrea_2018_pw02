package yncrea.pw02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yncrea.pw02.beans.Customer;
import yncrea.pw02.beans.Shop;
import yncrea.pw02.beans.impl.Company;
import yncrea.pw02.beans.impl.Person;
import yncrea.pw02.beans.impl.ShopImpl;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean
    public Shop knowledgeStore(){
        Shop knowledgeStore = new ShopImpl();
        Map<String, Integer> myStock = new HashMap<>();
        myStock.put("tv", 8);
        myStock.put("book", 7);
        myStock.put("cd", 2);
        knowledgeStore.setStock(myStock);
        return knowledgeStore;
    }

    @Bean
    public Shop appleStore(){
        Shop appleStore = new ShopImpl();
        Map<String, Integer> myStock = new HashMap<>();
        myStock.put("macbook pro", 10);
        myStock.put("iPhone X", 3);
        myStock.put("iPad", 50);
        appleStore.setStock(myStock);
        return appleStore;
    }

    @Bean
    public Customer mrsMichu(Shop appleStore){
        Person customer = new Person();
        customer.setFavouriteShop(appleStore);
        return customer;
    }

    @Bean
    public Customer awesomePros(Shop knowledgeStore){
        Company customer = new Company();
        customer.setFavouriteShop(knowledgeStore);
        customer.setLicense("123456");
        return customer;
    }
}
