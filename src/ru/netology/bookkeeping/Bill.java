package ru.netology.bookkeeping;

import ru.netology.bookkeeping.taxtypes.TaxType;

import java.math.BigDecimal;

public class Bill {

    private BigDecimal amount;
    private TaxType taxType;
    private TaxService taxService;

    public Bill(double amount, TaxType taxType, TaxService taxService) {
        this.amount = BigDecimal.valueOf(amount);
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {
        BigDecimal taxAmount = taxType.calculateTaxFor(amount);
        taxService.payOut(taxAmount);
    }
}
