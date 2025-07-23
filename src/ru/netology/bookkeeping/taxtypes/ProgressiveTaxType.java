package ru.netology.bookkeeping.taxtypes;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ProgressiveTaxType extends TaxType {

    private static final BigDecimal TAX_RATE_SMALL = BigDecimal.valueOf(0.1);
    private static final BigDecimal TAX_RATE_BIG = BigDecimal.valueOf(0.15);
    private static final BigDecimal LIMIT = BigDecimal.valueOf(100000);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {
        if (amount.compareTo(LIMIT) < 0) {
            return amount.multiply(TAX_RATE_SMALL)
                    .setScale(2, RoundingMode.HALF_UP);
        } else {
            return amount.multiply(TAX_RATE_BIG)
                    .setScale(2, RoundingMode.HALF_UP);
        }
    }
}
