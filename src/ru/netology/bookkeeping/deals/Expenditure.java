package ru.netology.bookkeeping.deals;

public class Expenditure extends Deal {


    public Expenditure(String product, int price) {
        super(String.format("Покупка %s на %d руб.", product, price), price, 0);
    }
}
