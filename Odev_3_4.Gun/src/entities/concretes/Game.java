package entities.concretes;

import entities.abstracts.Entity;

public class Game implements Entity {

    private int id;
    private String gameName;
    private String gameComment;
    private String gameCategory;
    private double price;
    private double afterDiscountPrice;

    public Game() {
    }

    public Game(int id, String gameName, String gameComment, String gameCategory, double price,
            double afterDiscountPrice) {
        this.id = id;
        this.gameName = gameName;
        this.gameComment = gameComment;
        this.gameCategory = gameCategory;
        this.price = price;
        this.afterDiscountPrice = afterDiscountPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameComment() {
        return gameComment;
    }

    public void setGameComment(String gameComment) {
        this.gameComment = gameComment;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAfterDiscountPrice() {
        return afterDiscountPrice;
    }

    public void setAfterDiscountPrice(double afterDiscountPrice) {
        this.afterDiscountPrice = afterDiscountPrice;
    }
}
