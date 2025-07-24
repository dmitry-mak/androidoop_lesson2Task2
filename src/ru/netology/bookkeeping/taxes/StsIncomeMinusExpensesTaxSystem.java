package ru.netology.bookkeeping.taxes;

public class StsIncomeMinusExpensesTaxSystem extends TaxSystem {

    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        if (profit < 0) {
            return 0;
        } else {
            return (int) (profit * 0.15);
        }
    }
}
