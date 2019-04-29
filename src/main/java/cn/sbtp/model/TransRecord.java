package cn.sbtp.model;

import java.util.Date;

public class TransRecord {
    private int id;
    private int bookId;
    private Date time;
    private int ownerId;
    private int buyerId;
    private double price;
    private int transType;
    private double sellerRate;
    private double buyerRate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTransType() {
        return transType;
    }

    public void setTransType(int transType) {
        this.transType = transType;
    }

    public double getSellerRate() {
        return sellerRate;
    }

    public void setSellerRate(double sellerRate) {
        this.sellerRate = sellerRate;
    }

    public double getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(double buyerRate) {
        this.buyerRate = buyerRate;
    }
}
