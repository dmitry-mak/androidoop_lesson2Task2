package ru.netology.bookkeeping;

import ru.netology.bookkeeping.deals.Deal;
import ru.netology.bookkeeping.deals.Expenditure;
import ru.netology.bookkeeping.deals.Sale;
import ru.netology.bookkeeping.taxes.StsIncomeMinusExpensesTaxSystem;
import ru.netology.bookkeeping.taxes.StsIncomeTaxSystem;
import ru.netology.bookkeeping.taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        TaxSystem incomeOnly = new StsIncomeTaxSystem();
        TaxSystem incomeMinusExpenses = new StsIncomeMinusExpensesTaxSystem();
        Company company = new Company("Первая", incomeOnly);
//        Company company2 = new Company("Вторая", incomeMinusExpenses);

//        System.out.println("Первый год:");
//        company.shiftMoney(100000);
//        company.shiftMoney(-20000);
//
//        company2.shiftMoney(100000);
//        company2.shiftMoney(-20000);
//
//        company.payTaxes();
//        company2.payTaxes();
//
//        System.out.println("Второй год:");
//        company.setTaxSystem(incomeMinusExpenses);
//        company.shiftMoney(100000);
//        company.shiftMoney(-20000);
//
//        company2.shiftMoney(100000);
//        company2.shiftMoney(-20000);
//
//        company.payTaxes();
//        company2.payTaxes();
//
//        System.out.println("Третий год:");
//        company.setTaxSystem(incomeMinusExpenses);
//        company.shiftMoney(100000);
//        company.shiftMoney(-20000);
//
//        company2.shiftMoney(100000);
//        company2.shiftMoney(-120000);
//
//        company.payTaxes();
//        company2.payTaxes();

        Deal sale1 = new Sale("молоко", 5000);
        Deal sale2 = new Sale("пельмени", 10000);
        Deal exp1 = new Expenditure("грузовик", 2000);
        Deal exp2 = new Expenditure("упаковка", 3000);

        Deal[] deals = {sale1, sale2, exp1, exp2};

        System.out.println("УСН доходы:");

        company.applyDeals(deals);

        System.out.println(" ");
        System.out.println("УСН доходы минус расходы: ");
        company.setTaxSystem(incomeMinusExpenses);
        company.applyDeals(deals);

    }
}
