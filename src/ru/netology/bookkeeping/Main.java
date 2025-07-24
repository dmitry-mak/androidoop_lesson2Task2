package ru.netology.bookkeeping;

import ru.netology.bookkeeping.taxes.StsIncomeMinusExpensesTaxSystem;
import ru.netology.bookkeeping.taxes.StsIncomeTaxSystem;
import ru.netology.bookkeeping.taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        TaxSystem incomeOnly = new StsIncomeTaxSystem();
        TaxSystem incomeMinusExpenses = new StsIncomeMinusExpensesTaxSystem();
        Company company = new Company("Первая");
        Company company2 = new Company("Вторая");
        company.setTaxSystem(incomeOnly);
        company2.setTaxSystem(incomeMinusExpenses);

        System.out.println("Первый год:");
        company.shiftMoney(100000);
        company.shiftMoney(-20000);

        company2.shiftMoney(100000);
        company2.shiftMoney(-20000);

        company.payTaxes();
        company2.payTaxes();

        System.out.println("Второй год:");
        company.setTaxSystem(incomeMinusExpenses);
        company.shiftMoney(100000);
        company.shiftMoney(-20000);

        company2.shiftMoney(100000);
        company2.shiftMoney(-20000);

        company.payTaxes();
        company2.payTaxes();

        System.out.println("Третий год:");
        company.setTaxSystem(incomeMinusExpenses);
        company.shiftMoney(100000);
        company.shiftMoney(-20000);

        company2.shiftMoney(100000);
        company2.shiftMoney(-120000);

        company.payTaxes();
        company2.payTaxes();

    }
}
