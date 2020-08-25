package tn.logarithme.dao;

import tn.logarithme.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDoa {

    private List<Product> productList;

    public List<Product> getProductList() {

        Product product1 = new Product();



        product1.setProductName("Record1");
        product1.setProductCategory("Record");
        product1.setProductDescription("this is a awesome mix of 20th century!");
        product1.setProductPrice(25);
        product1.setProductCondition("New");
        product1.setProductStatus("Active");
        product1.setUnitInStock(55);
        product1.setProductManufacturer("EMI");



        Product product2 = new Product();
        product2.setProductName("Guitar");
        product2.setProductCategory("instrument");
        product2.setProductDescription("this is a fender strat guitar!");
        product2.setProductPrice(1200);
        product2.setProductCondition("New");
        product2.setProductStatus("Active");
        product2.setUnitInStock(11);
        product2.setProductManufacturer("Fender");

        Product product3 = new Product();
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("this is a Polk Shelf Speaker!");
        product3.setProductPrice(355);
        product3.setProductCondition("New");
        product3.setProductStatus("Active");
        product3.setUnitInStock(9);
        product3.setProductManufacturer("Polk");


        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        return productList;


    }
}

