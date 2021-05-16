package entities.concretes;

import java.time.LocalDateTime;

import entities.abstracts.Entity;

public class Sale implements Entity {

    private int id;
    private String cartNumber;
    private LocalDateTime saleDateTime;

    public Sale() {
    }

    public Sale(int id, String cartNumber) {
        this.id = id;
        this.cartNumber = cartNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public LocalDateTime getSaleDateTime() {
        return saleDateTime;
    }

    public void setSaleDateTime() {
        this.saleDateTime = LocalDateTime.now();

    }
}