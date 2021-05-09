package entities.concretes;

public class Campaign extends Sale {

    private int id;
    private double discount;
    private String discountName;

    public Campaign() {
    }

    public Campaign(int id, double discount, String discountName) {
        this.id = id;
        this.discount = discount;
        this.discountName = discountName;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(final double discount) {
        this.discount = discount;
    }

    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(final String discountName) {
        this.discountName = discountName;
    }
}