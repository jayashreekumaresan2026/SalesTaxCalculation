package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Items {
    static double TaxAmount = 0.15;
    private List<Item> items;
    private List<String> exemptedSalesTaxItems;

    Items(List<Item> items) {
        this.items = items;
        this.exemptedSalesTaxItems = new ArrayList<>(Arrays.asList("pen", "pencil", "scale", "eraser"));
    }
    double calculateSalesTax() {
        double taxCost = 0;
        for (Item item : items) {
            taxCost = item.CostCalculation() * TaxAmount;
            item.showCalculation(taxCost);
        }
        return taxCost;
    }
    List<String> getExemptedSalesTaxItems() {
        return exemptedSalesTaxItems;
    }

}
