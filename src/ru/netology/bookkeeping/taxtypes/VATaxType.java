package ru.netology.bookkeeping.taxtypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VATaxType extends TaxType {

    private static final BigDecimal TAX_RATE = BigDecimal.valueOf(0.2);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        return amount.multiply(TAX_RATE)
                .setScale(2, RoundingMode.HALF_UP);
    }
}
