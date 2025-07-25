package ru.netology.bookkeeping;

import ru.netology.bookkeeping.deals.Deal;
import ru.netology.bookkeeping.taxes.TaxSystem;

public class Company {
    public String title;
    public int debit;
    public int credit;
    public TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.debit = 0;
        this.credit = 0;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере: %d рублей\n", title, tax);
        debit = 0;
        credit = 0;

    }

    public int applyDeals(Deal[] deals) {

        for (Deal deal : deals) {
            debit += deal.getDebitChange();
            credit += deal.getCreditChange();
            System.out.printf("Сделка: %s\n", deal.getComment());
        }
        int profitBeforeTaxes = debit - credit;

        payTaxes();
        return profitBeforeTaxes;
    }
}
