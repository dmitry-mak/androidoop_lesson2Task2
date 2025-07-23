package ru.netology.bookkeeping;

import ru.netology.bookkeeping.taxtypes.IncomeTaxType;
import ru.netology.bookkeeping.taxtypes.ProgressiveTaxType;
import ru.netology.bookkeeping.taxtypes.VATaxType;

public class Main {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[]{
                new Bill(1000, new IncomeTaxType(),taxService),
                new Bill(1000, new VATaxType(),taxService),
                new Bill(100001, new ProgressiveTaxType(),taxService),
                new Bill(99999, new ProgressiveTaxType(),taxService)
        };

        for (Bill payment : payments) {
            payment.payTaxes();
        }
    }
}
