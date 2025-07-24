package ru.netology.bookkeeping.taxes;

public class StsIncomeTaxSystem extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}
