package ru.netology.bookkeeping.deals;

public class Sale extends Deal {

    public Sale(String product, int price) {
        super(String.format("Продажа %s на %d руб.", product, price), 0, price);
    }
}
