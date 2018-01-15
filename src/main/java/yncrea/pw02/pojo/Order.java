package yncrea.pw02.pojo;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String license;
    private List<String> products = new ArrayList<>();

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List products) {
        this.products = products;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void addProduct(String product){
        this.products.add(product);
    }
}
