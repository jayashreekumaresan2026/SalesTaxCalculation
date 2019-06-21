package com.company;

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
    Double CostCalculation() {
        Double totalCost = 0.0;
        totalCost += price;
        return totalCost;
    }
    void showCalculation(double taxCost) {
        System.out.println("Item Name :" + name + " \t" + "Tax cost of an Item :" + taxCost);
    }

}
