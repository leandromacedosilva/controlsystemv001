package com.mycompany.controlsystemv001.manager;

import com.mycompany.controlsystemv001.model.Product;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leandro
 */
@Named
@ViewScoped
public class ProductManager implements Serializable {
    private Product product;
    private List<Product> products;
    
    @PostConstruct
    public void instance() {
        product = new Product();
        products = new ArrayList<>();
    }
    
    public void addProduct(){
        products.add(this.product);
        product = new Product();
        //instance();
    }
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
}
