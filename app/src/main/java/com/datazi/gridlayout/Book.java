package com.datazi.gridlayout;

/**
 * Created by Ashish on 2/21/2018.
 */

public class Book {
    private String name;
    private String isbn;
    private int image;
    private double price;

    public Book(){

    }

    public Book(String name, String isbn, int image, double price) {
        this.name = name;
        this.isbn = isbn;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
