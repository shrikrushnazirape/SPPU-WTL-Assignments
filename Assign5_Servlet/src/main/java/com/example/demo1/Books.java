package com.example.demo1;

public class Books {
    private String book_id;
    private String book_title, book_author;
    private int book_price, quantity;
    public String getId() {
        return book_id;
    }
    public void setId(String id) {
        this.book_id = id;
    }
    public String getTitle() {
        return book_title;
    }
    public void setTitle(String name) {
        this.book_title = name;
    }
    public String getAuthor() {
        return book_author;
    }
    public void setAuthor(String author) {
        this.book_author = author;
    }
    public int getPrice() {
        return book_price;
    }
    public void setPrice(int price) {
        this.book_price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int q) {
        this.quantity = q;
    }

}