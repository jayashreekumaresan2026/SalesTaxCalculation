package com.company;

import java.util.List;

public class Item {
        private String name;
        private int quantity;
        private Double price;

        Item(String name, Double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        void showName() {
            System.out.println("Item Name :" + name);
        }
    @Override
    public String toString() {
        return "Item Name :" + name + "\nItem quantity : " + quantity + "\nItem Price :" + price + "\n";
    }

    void showCalculation(double taxCost) {
        System.out.println("Item Name :" + name + " \t" + "Tax cost of an Item :" + taxCost);
    }
    void isExemptedTaxItem(List<String> exemptedSalesTaxItems) {
        for (int i = 0; i < exemptedSalesTaxItems.size(); i++) {
            if (exemptedSalesTaxItems.get(i).equalsIgnoreCase(name)) {
                System.out.println("ItemName :" + name + "  " + "ItemCost :" + CostCalculation());
            }
        }
    }
    Double CostCalculation() {
        Double totalCost = 0.0;
        totalCost += price;
        return totalCost;
    }
    Double itemCostCalculation() {
        Double itemCost = 0.0;
        itemCost += price*quantity;
        return itemCost;
    }

    void totalCost(Double finalCost) {
        System.out.println("Item Name :" + name + "\nItem quantity : " + quantity + "\nItem Price :" + finalCost+ "\n");
    }

}
