package com.abdullah.course_app;

public class courseDomain {
    private String title;
    private String owner;
    private double price;
    private double star;
    private int picPath;

    public courseDomain(String title, String owner, double price, double star, int picPath) {
        this.title = title;
        this.owner = owner;
        this.price = price;
        this.star = star;
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public String getOwner() {
        return owner;
    }

    public double getPrice() {
        return price;
    }

    public double getStar() {
        return star;
    }

    public int getPicPath() {
        return picPath;
    }
}
