package entities.concretes;

import entities.abstracts.Entity;

public class Sale implements Entity {

    private int id;
    private String gameName;
    private String gameComment;
    private int gameCategory;
    private String gameCategoryName;
    private double price;
    private double afterDiscountPrice;

    public Sale() {
    }

    public Sale(int id, String gameName, String gameComment, int gameCategory, String gameCategoryName, double price,
            double afterDiscountPrice) {
        this.id = id;
        this.gameName = gameName;
        this.gameComment = gameComment;
        this.gameCategory = gameCategory;
        this.gameCategoryName = gameCategoryName;
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

    public int getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(int gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGameCategoryName() {
        return gameCategoryName;
    }

    public void setGameCategoryName(String gameCategoryName) {
        this.gameCategoryName = gameCategoryName;
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