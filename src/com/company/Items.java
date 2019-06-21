package com.company;

import java.util.List;

public class Items {
    static double TaxAmount = 0.15;
    private List<Item> items;

    Items(List<Item> items) {
        this.items = items;
    }
    double calculateSalesTax() {
        double taxCost = 0;
        for (Item item : items) {
            taxCost = item.CostCalculation() * TaxAmount;
            item.showCalculation(taxCost);
        }
        return taxCost;
    }

}
