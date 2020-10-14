package com.yandex.testtask;

public class Item {
    private  String itemType;
    private  String priceFrom;
    private  String priceTo;
    private  String brand;

    public Item(String itemType, String priceFrom, String priceTo, String brand) {
        this.itemType = itemType;
        this.priceFrom = priceFrom;
        this.priceTo = priceTo;
        this.brand = brand;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setPriceFrom(String priceFrom) {
        this.priceFrom = priceFrom;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getItemType() {
        return itemType;
    }

    public String getPriceFrom() {
        return priceFrom;
    }

    public String getPriceTo() {
        return priceTo;
    }

    public String getBrand() {
        return brand;
    }
}
